# 2026.0

## Features

### Mega Drive
- Bars should be pixel perfect
- Finish development of Window panels
- Water alignment bug?

### NeoGeo
- Implement Road
- Finish development of Window panels
- Implement Furnace tracker support
- Bars should be pixel perfect
- Water alignment bug?

## Bugs

### NeoGeo
- Fix CRAM snow during fades (almost complete but some minor fixes needed)

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

### NeoGeo
- AutoAnim should be available for animations, not just tiles
- Support additional MVS functionality such as coin drops
- Implementation of all Road/Floor functions
- Music looping should be supported equally in CD and ADPCMB

### Scorpion Box
- Improve mouse tracking around borders
- GFX should be pixel scaled by default, options for smooth scaling (+ CRT filters?)
- Improve pixel-by-pixel copy for OpenGL

### Scorpion Box Web
- Fork emulator.js in order to create a version of Scorpion Box that is compatible (so far as possible) with Scorpion Box configuration files, as well as NeoGeo and Amiga support

### Universal
- ShrinkX/Y should be relative to actor 0 position
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
- Panel elements need to be optimised

### Editor
- MusicVolume commands should be blocked on platforms that do not support them 