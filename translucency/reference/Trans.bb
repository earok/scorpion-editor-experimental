;Adapted by Earok
;Based on AMOS code and project by Mike at https://bitbeamcannon.com/
#Width = 320
#Height = 200
#Top = 44
#Bitplanes = $6
#Sprites = 8
#Colors = 32
#EHB = $40

#BackBuffer = 0
#FrontBuffer = 1
#SourceBitmap = 2

;We only want to blit to the top four bitplanes for the full bitmap
#FullBitmapBackBuffer = 3
#FullBitmapFrontBuffer = 4
#FullBitmapSourceBitmap = 5
#FullBitmapMask = %111100

;For partial, we need to ignore just the second bitplane
#PartialBitmapBackBuffer = 6
#PartialBitmapFrontBuffer = 7
#PartialBitmapSourceBitmap = 8
#PartialBitmapMask = %111101

for i = #BackBuffer to #SourceBitmap

  BitMap i,960,400,#Bitplanes
  BitPlanesBitMap i,#FullBitmapBackBuffer + i,#FullBitmapMask
  BitPlanesBitMap i,#PartialBitmapBackBuffer + i,#PartialBitmapMask
  Buffer i,16384

next

LoadBitMap #SourceBitmap,"trp.iff",0
CopyBitMap #SourceBitmap,#BackBuffer
CopyBitMap #SourceBitmap,#FrontBuffer

BLITZ
BlitzKeys On

Statement SetScreen{x,y}

  DisplayBitMap 0,#SourceBitmap,x * #Width,y * #Height
  
End Statement

Statement DisplayScreen{x,y}

  SetScreen{x,y}
  while Inkey$ = ""
  wend

End Statement

;Resize the width of a copperlist
Statement ResizeWidth{clist.l,amount.l,xadjust.l}

	diwstrt.l = xadjust*8
	diwstop.l = diwstrt + amount*8

	dUfstrt.l = Int(diwstrt/2)
	dUfstop.l = Int(diwstop/2)

	DisplayAdjust clist,amount,dUfstrt,dUfstop,diwstrt,diwstop

End Statement

InitCopList 0,#Top,#Height,#Bitplanes + #EHB,#Sprites,#Colors,0
DisplayPalette 0,0

ResizeWidth{0,2,-2} ;Width is resized to compensate for blitz moving screen to right for scrolling
CreateDisplay 0

Use Bitmap #FullBitmapSourceBitmap
GetaShape 1,504,1,564-504,85-1

Use Bitmap #PartialBitmapSourceBitmap
GetaShape 2,570,1,630-570,85-1

Use Bitmap #SourceBitmap
GetaShape 3,328,305,455-328,366-305

DisplayScreen{0,0} ;one
DisplayScreen{1,0} ;two
DisplayScreen{2,0} ;three

SetScreen{0,1}

Bounce1Dir = 1
Bounce2DirX = 1
Bounce2DirY = 0

while Inkey$ = ""

  ;Display the screen, flip the buffers and empty the queues
  VWait
  DisplayBitMap 0,BackBuffer,0,#Height
  BackBuffer = 1-BackBuffer

  Use BitMap BackBuffer
  UnBuffer BackBuffer

  ;Rough replication of AMAL commands
  Bounce1 + Bounce1Dir * 2
  if Bounce1 > 200
    Bounce1 = 200
    Bounce1Dir = -1
  endif
  if Bounce1 < 0
    Bounce1 = 0
    Bounce1Dir = 1
  endif

  Bounce2X + Bounce2DirX * 3
  Bounce2Y + Bounce2DirY * 3

  if Bounce2X > 200
    Bounce2X = 200
    Bounce2DirX = 0
    Bounce2DirY = 1
  endif
  if Bounce2Y > 100
    Bounce2Y = 100
    Bounce2DirX = -1
    Bounce2DirY = 0
  endif
  if Bounce2X < 0
    Bounce2X = 0
    Bounce2DirX = 0
    Bounce2DirY = -1
  endif
  if Bounce2Y < 0
    Bounce2Y = 0
    Bounce2DirX = 1
    Bounce2DirY = 0
  endif

  Use BitMap BackBuffer
  BBlit BackBuffer,3,1 + Bounce1,260

  Use BitMap BackBuffer + #FullBitmapBackBuffer
  BBlit BackBuffer,1,1 + Bounce2X,201 + Bounce2Y

  Use BitMap BackBuffer + #PartialBitmapBackBuffer
  BBlit BackBuffer,2,260 - Bounce2X,311 - Bounce2Y

wend

End
