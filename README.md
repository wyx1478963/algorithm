# 算法与数据结构
# 一些待解决细致问题
# 总结

## Addition Question List
### CPU占用问题
程序代码如下所示，CPU占用率如何？
```java
  while(true){
    sleep(1);
   }
```
与单纯死循环对比：其实就是添加了一句“Sleep(1)”，但是CPU占用率就直接从100%跌到了1%左右。
Sleep()是Windows API线程调度相关的函数，将当前线程置入等待状态，并让它等待一段指定的时间间隔（以毫秒ms为单位），零值表示放弃该线程时限的剩余部分。
Comments：CPU是以纳秒级单位运转的！
### Java应用问题排查
1. 获取应用PID
```shell
jps
```
2. 获取PID的所有线程
```shell
ps -mp pid -o THREAD,tid,time
```
3. 查看内部线程占用CPU和时间，得到线程id
4. 线程id转成16进制
```shell
jstack pid | grep tid
```
5. 能观察到主要消耗资源的堆栈
