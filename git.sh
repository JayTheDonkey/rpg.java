#!/bin/bash
# jackson can ignore this until he installs linux

# color variables for output (see https://gist.github.com/GabrielD42/9de9668486ef0b642b48)
red='\e[0;31m'
green='\e[0;32m'
NC='\e[0m' # No Color

if [[ $# == 1 ]]; then
	echo -e "\n${green}********************************\n* Uploading new code to Github *\n********************************${NC}\n"
	rm *.java~
	git add --all
	git commit -m "$1"
	git push
else
	echo -e "\n${red}Error: Incorrect Arguments.${NC}\n./deploy.sh 'commit message'"
	exit 1
fi