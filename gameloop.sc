#!/bin/bash
#contains main game loop that will be timed


read -d '' -a linenumbers <<< "$(awk "/Level$1/ {print NR}" levelselect)"


sed -n "$((${linenumbers[0]}+2)),$((${linenumbers[1]}-2))p" levelselect > tempanswers 


sed -n "$((${linenumbers[1]}+2)),$((${linenumbers[2]}-2))p" levelselect > templevel


vim templevel




