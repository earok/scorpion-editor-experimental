### LookupTable

**Category:**
Variable

**Syntax:**

```scorpionengine
LookupTable Size VarName "FileName"
```

**Description:**

Array that reads from a text file with one constant per line, or Key=Value to set a specific key. Keys may be negative. Read only.

Size: The variable size in Byte/Word/Long/Fraction
VarName: The variable name
FileName: The relative file path

```scorpionengine

LookupTable Word MyVariable "MyFile.txt"

```
