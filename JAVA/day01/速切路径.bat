@echo off
set LAST_DIR=%cd%
set CUR_DIR=%~dp0
%CUR_DIR:~0,2%
cd %CUR_DIR%
::recover old comment
::%LAST_DIR:~0,2%
::cd %LAST_DIR%