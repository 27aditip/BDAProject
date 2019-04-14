
set MYSQL_HOME=%~dp0/mysql-5.7.21-winx64
cd %MYSQL_HOME%

rmdir /s /q data

cd bin
mysqld --initialize-insecure

pause