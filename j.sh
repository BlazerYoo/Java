file_name=$1
echo Compiling $file_name...
javac $file_name
echo Successfully compiled $file_name.
echo Executing $file_name...
shift
java ${file_name%%.java} $@
