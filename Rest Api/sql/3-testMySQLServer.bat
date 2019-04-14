
set MYSQL_HOME=%~dp0/mysql-5.7.21-winx64
cd %MYSQL_HOME%/bin

title "Testing MySQL Server"

mysqladmin -u root version status proc

echo "Execute mysql_upgrade to remove this error - mysqld: Table 'mysql.plugin' doesn't exist
mysql_upgrade -u root 

pause