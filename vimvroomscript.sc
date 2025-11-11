#!/bin/bash

#have the game level file 
#have the "answer file"
#open the game file
#pause until the game file is saved and closed
#check the game file against the answer file
#display if files match
#show time



echo "**********************"
echo ""
echo "select level"
echo "01, 02, 03, 04, 05"
read levelnumber

time ./gameloop.sc $levelnumber
diff -q answerlevel01 templevel
echo ""
echo "**********************"






