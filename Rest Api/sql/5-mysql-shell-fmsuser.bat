
set MYSQL_HOME=%~dp0/mysql-5.7.21-winx64
cd %MYSQL_HOME%/bin

title "MySQL Server Shell"

mysql -u fmsuser -h localhost -pmit@2019

pause