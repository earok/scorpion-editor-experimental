cd ..\amiga_boot_sector
..\vasmm68k_mot -Fbin -nosym -o bootsector.bin bootsector.asm

cd ..\functions
..\vasmm68k_mot -Fbin -nosym -o fixed_multiply.bytes fixed_multiply.asm
..\vasmm68k_mot -Fbin -nosym -o fixed_division.bytes fixed_division.asm

pause

