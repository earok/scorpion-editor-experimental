### ASMPlugin

**Category:**
Data

**Syntax:**

```scorpionengine
ASMPlugin "FileName" D0=Expression D1=Expression D2=Expression D3=Expression D4=Expression D5=Expression A0=VarName A1=VarName A2=VarName A3=VarName A4=VarName A5=VarName
```

**Description:**

Embed 68k code directly into the codeblock.

FileName: The relative file path
D0: Set data register
D1: Set data register
D2: Set data register
D3: Set data register
D4: Set data register
D5: Set data register
A0: Set address register
A1: Set address register
A2: Set address register
A3: Set address register
A4: Set address register
A5: Set address register

```scorpionengine

ASMPlugin "MyFile.txt" D0=Expression D1=Expression D2=Expression D3=Expression D4=Expression D5=Expression A0=VariableAddress A1=VariableAddress A2=VariableAddress A3=VariableAddress A4=VariableAddress A5=VariableAddress

```
