package com.riverluoo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @since 2018/11/28 6:28 PM
 */
@Configuration
@EnableTransactionManagement(order = 2)
@MapperScan(basePackages = {"com.riverluoo.dao.mapper"})
public class MybatisPlusConfig {

    @Resource
    private DruidProperties druidProperties;

    /**
     * 单数据源连接池配置
     */
    @Bean
    public DruidDataSource singleDatasource() {
        DruidDataSource dataSource = new DruidDataSource();
        druidProperties.config(dataSource);
        return dataSource;
    }

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
