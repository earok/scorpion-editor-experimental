### Panel

**Category:**
Display

**Syntax:**

```scorpionengine
Panel Panel Music=Expression MusicPos=Expression PanelTop=Expression PanelBottom=Expression Frames=Expression ForFire NoLevelUnload Cache
```

**Description:**

Change the panel on the main display

Panel: The main full-screen panel
Music: The music to load
MusicPos: The position to start the music from (Protracker)
PanelTop: The top panel to load
PanelBottom: The bottom panel to load
Frames: The number of frames
ForFire: If this command waits for the user to press fire
NoLevelUnload: Keep level loaded in the background
Cache: Preload from cache

```scorpionengine

Panel MyPanel Music=MyMusic MusicPos=1 PanelTop=MyTopPanel PanelBottom=MyBottomPanel Frames=1 ForFire NoLevelUnload Cache

```
