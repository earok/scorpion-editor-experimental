### Variable

**Category:**
Variable

**Syntax:**

```scorpionengine
Variable Size VarName=Expression Reset
```

**Description:**

A changeable number. Value field contains the default value.

Size: The variable size in Byte/Word/Long/Fraction
VarName: The variable name
Expression: The expression such as X+5
Reset: Also set the variable back to this value whenever this line is reached

```scorpionengine

Variable Word MyVariable=5*5 Reset

```
