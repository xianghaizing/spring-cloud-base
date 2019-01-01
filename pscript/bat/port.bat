@echo off
set /p port=port:
for /f "tokens=5" %%i in ('netstat -aon ^| findstr ":%port%"') do (
    set n=%%i
)
taskkill /f /pid %n%