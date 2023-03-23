#### 带着问题阅读《深入理解Java虚拟机》

1. 服务器管理员在配置虚拟机参数时，会根据实际内存设置-Xmx等参数，但经常忽略直接内存 ，使得各个内存区域总和大于物理内存限制，这么离谱嘛？
2. 怎么区分内存泄漏(Memory Leak)还是内存溢出(Memory Overflow)？
3. 怎么看 -Xlog:gc*(-XX:+PrintGCDetails的ti'dai) 的信息