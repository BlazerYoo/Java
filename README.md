# Java
Compile and run Java programs with one command

## Set up
1. Open Git Bash or any project in IntelliJ (if you opened a project in IntelliJ, open terminal [Alt + 2])
3. Run `cd ~`
4. `curl https://raw.githubusercontent.com/BlazerYoo/Java/main/j.sh > j.sh`
5. `curl https://raw.githubusercontent.com/BlazerYoo/Java/main/jintro.sh > jintro.sh`
6. You may have to run `chmod +x j.sh` and `chmod +x jintro.sh`

## Usage
Use `j.sh` for running regular Java programs
```
~/your/path/here> j.sh Test1.java 0 1 2 3
Compiling Test1.java...
Successfully compiled Test1.java.
Executing Test1...
0
1
2
3
```

Use `jintro.sh` for running Java programs using COS126 libraries
```
~/your/path/here> cat stdin.txt
Start
Hello World
0
1
2 3 4
End
~/your/path/here> jintro.sh Test2.java < stdin.txt '>' stdout.txt
Compiling Test1.java...
Successfully compiled Test1.java.
Executing Test1...
~/your/path/here> cat stdout.txt
Start
Hello World
0
1
2 3 4
End
```
