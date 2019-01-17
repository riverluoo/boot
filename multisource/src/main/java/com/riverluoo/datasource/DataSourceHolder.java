package com.riverluoo.datasource;

import org.apache.log4j.Logger;

/**
 * @author wangyang
 * @since 2018/11/21 4:56 PM
 */
public class DataSourceHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    private static final Logger LOGGER = Logger.getLogger(DataSourceHolder.class);


    /**
     * @param dataSourceType 数据库类型
     * @return void
     * @throws
     * @Description: 设置数据源类型
     */
    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    /**
     * @param
     * @return String
     * @throws
     * @Description: 获取数据源类型
     */
    public static String getDataSourceType() {
        return contextHolder.get();
    }

    /**
     * @param
     * @return void
     * @throws
     * @Description: 清除数据源类型
     */
    public static void clearDataSourceType() {
        contextHolder.remove();
    }

}
