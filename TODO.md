# TODO

## Features

### Amiga
- When there's not enough sprites left in auto sprite mode, just use the sprites available and fill out the rest with blitter
- Control the number of buffers, default at 2 but could be 1 or more than 2
- Implement ISOCD Win to streamline CD32 development (https://github.com/fuseoppl/isocd-win)

### Mega Drive
- Ongoing development of sprite UI elements

### NeoGeo
- AutoAnim should be available for animations, not just tiles
- Support additional MVS functionality such as coin drops

### Scorpion Box
- Improve mouse tracking around borders
- GFX should be pixel scaled by default, options for smooth scaling (+ CRT filters?)
- Improve pixel-by-pixel copy for OpenGL

### Scorpion Box Web
- Fork emulator.js in order to create a version of Scorpion Box that is compatible (so far as possible) with Scorpion Box configuration files, as well as NeoGeo and Amiga support

### Universal
- Byte sized variables should only use 1 byte of memory (when used in pairs)
- Lookup tables should also work for strings
- Lookup tables should support negative keys
- All systems should support real time color changes to water layer
- Remove repeat frame events, instead each individual animation event should be flagged about whether it should repeat across the entire frame delay or not
- Add codeblocks control settings for Race Car
- Add steer towards codeblock command
- Make sure that tilesets or tileset images outside of the project folder are not supported

## Bugs

### Amiga
- ~~Audio issue (glitch with sounds repeated ~12 seconds)~~ — technically not solved, but improved and on hold for now
