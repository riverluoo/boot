## spingboot 异步线程池

### 定义线程池

~~~java
executor.setCorePoolSize(10); 
executor.setMaxPoolSize(100);
executor.setQueueCapacity(100); 
executor.setWaitForTasksToCompleteOnShutdown(true);
executor.setAwaitTerminationSeconds(60);
executor.setThreadNamePrefix("AsyncThread-");
executor.initialize();
~~~

- 核心线程池 ：线程池创建时初始化的线程数
- 最大线程池 ：线程池最大的线程数，只有在缓冲队列满了之后才会申请超过核心线程数的线程
- 缓冲队列   ：用来缓冲执行任务的队列
- 线程关闭   ：当Spring容器shutdown的时候, ThreadPoolTaskExecutor中的任务会shutdownNow 还是会等待任务执行完成之后shutdown
- 等待时间 ：秒
- 线程别名
- 线程初始化
