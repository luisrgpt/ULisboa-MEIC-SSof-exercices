#!/bin/sh


old=`ls -l ./dummy2`
new=`ls -l ./dummy2`
while [ "$old" = "$new" ]
do
    new=`ls -l ./dummy2`
done

echo "STOP... The dummy file has been changed"
