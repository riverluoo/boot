package com.riverluoo.generic;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author wangyang
 * @since 2018-12-07 09:57
 */
public abstract class AbstractBaseDaoImpl<T> {

    public AbstractBaseDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        Type[] typeParameters = pt.getActualTypeArguments();
        entityClass = (Class<T>) typeParameters[0];

    }

    private Class<T> entityClass;

    public void save(T t) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(entityClass.getSimpleName());

        sb.append("(");
        Field[] fields = entityClass.getDeclaredFields();
        String fieldNames = Arrays.asList(fields).stream().map(x -> x.getName()).collect(Collectors.joining(","));
        sb.append(fieldNames);
        sb.append(") VALUES(");
        sb.append(fieldNames.replaceAll("[^,]+", "?"));
        sb.append(")");


        System.out.println(sb.toString());
    }



}
