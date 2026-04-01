# TODO

## Features

### Amiga
- When there's not enough sprites left in auto sprite mode, just use the sprites available and fill out the rest with blitter
- Control the number of buffers, default at 2 but could be 1 or more than 2

### Mega Drive
- Ongoing development of sprite UI elements

### NeoGeo
- AutoAnim should be available for animations, not just tiles

### Scorpion Box
- Improve mouse tracking around borders
- GFX should be pixel scaled by default, options for smooth scaling (+ CRT filters?)
- Improve pixel-by-pixel copy for OpenGL

### Universal
- Lookup tables should also work for dynamic labels
- All systems should support real time color changes to water layer
- Remove repeat frame events, instead each individual animation event should be flagged about whether it should repeat across the entire frame delay or not
- Continue development of new Race Car controller

## Bugs

### Amiga
- ~~Audio issue (glitch with sounds repeated ~12 seconds)~~ — technically not solved, but improved and on hold for now
- 2025.0 should be patched so that freemem codeblock includes freeing the talkpad
- Known bugs with Camera Warp Fast
