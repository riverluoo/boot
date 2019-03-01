package com.riverluoo.datasource;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author wangyang
 * @since 2018/11/22 5:28 PM
 */
@Aspect
@Component
public class DataSourceAspect implements Ordered {

    private static final Logger LOGGER = Logger.getLogger(DataSourceAspect.class);

    @Pointcut(" @annotation(com.riverluoo.datasource.DataSource)")
    public void dataSourcePointCut() {

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        DataSource ds = method.getAnnotation(DataSource.class);
        if(ds == null){
            DataSourceHolder.setDataSourceType(DataSourceNames.MASTER);
        }else {
            DataSourceHolder.setDataSourceType(ds.name());
        }

        try {
            return point.proceed();
        } finally {
             DataSourceHolder.clearDataSourceType();
             Object
        }
    }
    @Override
    public int getOrder() {
        return 0;
    }
}
