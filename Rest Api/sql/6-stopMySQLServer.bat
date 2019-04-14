
set MYSQL_HOME=%~dp0/mysql-5.7.21-winx64
cd %MYSQL_HOME%/bin

title "Stopping MySQL Server"

mysqladmin -u root shutdown

pause