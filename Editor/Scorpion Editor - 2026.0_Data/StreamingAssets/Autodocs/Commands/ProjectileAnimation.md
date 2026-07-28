### ProjectileAnimation

**Category:**
Projectile

**Syntax:**

```scorpionengine
ProjectileAnimation Animation Frame=Expression Loop AutoFlip NoRestart
```

**Description:**

Trigger an animation on the entity

Animation: The animation to play
Frame: The first frame
Loop: Loop until cancelled
AutoFlip: Try to flip the animation left/right automatically if needed
NoRestart: Don't restart if the animation is already playing

```scorpionengine

ProjectileAnimation MyAnimation Frame=1 Loop AutoFlip NoRestart

```
