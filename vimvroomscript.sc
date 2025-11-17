#!/bin/bash


#todays goals:
#level select
#single file for levels and answers
#load test into temp test before every game



echo "**********************"
echo ""
echo "select level"
echo "01, 02, 03, 04, 05"
read levelnumber

time ./gameloop.sc $levelnumber
diff -q tempanswers templevel
echo ""
echo "**********************"






