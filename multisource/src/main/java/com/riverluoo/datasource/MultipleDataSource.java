package com.riverluoo.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 *  多数据源
 *
 * @author wangyang
 * @since 2018/11/21 4:25 PM
 */
public class MultipleDataSource extends AbstractRoutingDataSource {


    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSourceType();
    }
}
