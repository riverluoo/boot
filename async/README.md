## spingboot 异步线程池

### 定义线程池

~~~java
executor.setCorePoolSize(10); 
executor.setMaxPoolSize(100);
executor.setQueueCapacity(100); 
executor.setWaitForTasksToCompleteOnShutdown(true);
executor.setAwaitTerminationSeconds(60 * 10);
executor.setThreadNamePrefix("AsyncThread-");
executor.initialize();
~~~

- 核心线程池 ：线程池创建时初始化的线程数
- 
