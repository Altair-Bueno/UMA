#!/bin/zsh
for file in **/*.java
do 
    echo "## $(basename $file)"
    echo 
    echo "\`\`\`{include=$file}"
    echo '```'
    echo
done