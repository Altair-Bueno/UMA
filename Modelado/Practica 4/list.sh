#!/bin/zsh

FOLDER_NAME=''
for file in **/*.java
do 
    if [[ $(dirname $file) != $FOLDER_NAME ]]
    then
        FOLDER_NAME="$(dirname $file)"
        echo "## $(basename $FOLDER_NAME)"
        echo
    fi

    echo "### \`$(basename $file)\`"
    echo 
    echo "\`\`\`{include=$file}"
    echo '```'
    echo
done