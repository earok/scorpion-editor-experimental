# 2026.0

## Features

### Mega Drive
- Finish development of Window panels

### NeoGeo
- Implement Road
- Finish development of Window panels
- Retire RAINE, switch to MAME for NeoGeo CD development
- Implement Furnace tracker support

## Bugs

### Amiga
- Panel elements need to be optimised

### Editor
- MusicVolume commands should be blocked on platforms that do not support them 

# 2026.1 and future

## Features

### Amiga
- When there's not enough sprites left in auto sprite mode, just use the sprites available and fill out the rest with blitter
- Implement ISOCD Win to streamline CD32 development (https://github.com/fuseoppl/isocd-win)
- Manipulate music per channel?
- Parallel port adapter needs to be configured as a default in WinUAE.
- Single buffer mode (BufferCount=1) needs more work — panel system currently assumes double buffering
- Add parallax tricks 3

### Mega Drive
- Ongoing development of sprite UI elements
- Bars should have an option for pixel perfect

### NeoGeo
- AutoAnim should be available for animations, not just tiles
- Support additional MVS functionality such as coin drops
- Implementation of all Road/Floor functions
- Bars should have an option for pixel perfect
- ShrinkX/Y should be relative to actor 0 position
- Music looping should be supported equally in CD and ADPCMB

### Scorpion Box
- Improve mouse tracking around borders
- GFX should be pixel scaled by default, options for smooth scaling (+ CRT filters?)
- Improve pixel-by-pixel copy for OpenGL

### Scorpion Box Web
- Fork emulator.js in order to create a version of Scorpion Box that is compatible (so far as possible) with Scorpion Box configuration files, as well as NeoGeo and Amiga support

### Universal
- Window Panels should support Talkpads
- Lookup tables should also work for strings
- Lookup tables should support negative keys
- All systems should support real time color changes to water layer
- Remove repeat frame events, instead each individual animation event should be flagged about whether it should repeat across the entire frame delay or not
- Add car boost settings for codeblocks
- Add steer towards codeblock command
- Shrink command to be added to Codeblocks2
- Full audit of all ASM code needed
- Actor separate command should have "weight" so that one actor can fully push the other one (maybe default to 0.5 so they're evenly separated)
- Add 'calculator' panel demo
- ActorMoveToward function
- Arrays should work in panel elements

## Bugs

### Amiga

- ~~Audio issue (glitch with sounds repeated ~12 seconds)~~ — technically not solved, but improved and on hold for now
