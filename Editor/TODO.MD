# TODO

## Features

### Amiga
- When there's not enough sprites left in auto sprite mode, just use the sprites available and fill out the rest with blitter
- Implement ISOCD Win to streamline CD32 development (https://github.com/fuseoppl/isocd-win)
- Manipulate music per channel?
- Parallel port adapter needs to be configured as a default in WinUAE.
- Single buffer mode (BufferCount=1) needs more work — panel system currently assumes double buffering

### Mega Drive
- Ongoing development of sprite UI elements
- Finish development of Window panels
- Bars should have an option for pixel perfect

### NeoGeo
- AutoAnim should be available for animations, not just tiles
- Support additional MVS functionality such as coin drops
- Implementation of all Road/Floor functions
- Bars should have an option for pixel perfect

### Scorpion Box
- Improve mouse tracking around borders
- GFX should be pixel scaled by default, options for smooth scaling (+ CRT filters?)
- Improve pixel-by-pixel copy for OpenGL

### Scorpion Box Web
- Fork emulator.js in order to create a version of Scorpion Box that is compatible (so far as possible) with Scorpion Box configuration files, as well as NeoGeo and Amiga support

### Universal
- Lookup tables should also work for strings
- Lookup tables should support negative keys
- All systems should support real time color changes to water layer
- Remove repeat frame events, instead each individual animation event should be flagged about whether it should repeat across the entire frame delay or not
- Add car boost settings for codeblocks
- Add steer towards codeblock command
- Full audit of all ASM code needed
- Actor separate command should have "weight" so that one actor can fully push the other one (maybe default to 0.5 so they're evenly separated)

## Bugs

### Amiga
- ~~Audio issue (glitch with sounds repeated ~12 seconds)~~ — technically not solved, but improved and on hold for now
- Window Panels broken on tall maps
- Talkpad needs to be reworked to avoid flashing panel elements

### NeoGeo
- Shrunken sprites sometimes contain junk from previous sprite renders

### Universal
- Bug with players being frozen and unfrozen?
- Bug with spawning from blocks? (Wizonk)

## Documentation
- Help for control mode
- Help for defragging