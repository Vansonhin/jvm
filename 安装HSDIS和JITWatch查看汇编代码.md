安装HSDIS和JITWatch查看汇编代码

1. 将下载好的HSDIS（hsdis-amd64.dll）放到 JAVA_HOME/bin/server里
2. git clone https://github.com/AdoptOpenJDK/jitwatch，在该目录运行mvn clean compile test exec:java 就能打开JITWatch界面

