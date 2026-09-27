### Database

**Category:**
Variable

**Syntax:**

```scorpionengine
Database VarName "FileName"
```

**Description:**

LookUpTables from a CSV sharing one Key column. Other columns end in .b/.w/.l/.f/.s and are read as Name_Column[Key]

VarName: The variable name
FileName: The relative file path

```scorpionengine

Database MyVariable "MyFile.txt"

```
