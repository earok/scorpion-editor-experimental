### Level

**Category:**
Level

**Syntax:**

```scorpionengine
Level Level NoFadeIn Music=Expression MusicPos=Expression PanelTop=Expression PanelBottom=Expression Background=Expression
```

**Description:**

Load and run a new level

Level: The Level to load
NoFadeIn: Prevent automatic fade in
Music: The music to load
MusicPos: The position to start the music from (Protracker)
PanelTop: The top panel to load
PanelBottom: The bottom panel to load
Background: The background to load

```scorpionengine

Level MyLevel NoFadeIn Music=MyMusic MusicPos=5*MyVar PanelTop=MyTopPanel PanelBottom=MyBottomPanel PanelBackground=MyBottomPanel

```
