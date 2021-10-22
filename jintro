java_name=$1
echo Compiling $java_name...
javac-introcs $java_name 2> error
if [ -s error ]; then
    cat error
else
    echo Successfully compiled $java_name.
    echo Executing ${java_name%%.java}...
    shift
    if [[ "${@#*'>'*}" != "$@" ]]; then
        java-introcs ${java_name%%.java} $@ > ${@#*'>'}
    else
        java-introcs ${java_name%%.java} $@
    fi
fi
rm error
