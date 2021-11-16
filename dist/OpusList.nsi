Name "Opus List SPDVI"

OutFile "setup-opusList-v1.exe"

RequestExecutionLevel user

Unicode True

InstallDir $PROGRAMFILES\OpusList

; Pages
Page components 
Page directory	
Page instfiles
UninstPage uninstConfirm
UninstPage instfiles

; Stuff to install
Section "Required files" required_files
	SectionIn RO
	SetOutPath $INSTDIR
	File GaleriaDeImagenes.jar 
	SetOutPath "$INSTDIR\lib"
	File lib\gson-2.8.2.jar
SectionEnd

Section "Initialize dummy data" dummy_data
	CreateDirectory "$LOCALAPPDATA\OpusList\data"
	SetOutPath "$LOCALAPPDATA\OpusList\data"
	File obres.json
	CreateDirectory "$LOCALAPPDATA\OpusList\images"
	SetOutPath"$LOCALAPPDATA\OpusList\images"
	File images\*.*
SectionEnd

