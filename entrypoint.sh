host="mysql"
password="K4llil01" #mysql root password

until mysql -h "$host" -u root -p $password; do
	 echo "MYSQL is unavailable - sleeping"
	sleep 1
done

echo "MYSQL is up - executing command"
# start your app here
