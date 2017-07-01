package org.naozi.sakamichi.config.druid;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Naozi on 2017/6/30.
 */
@Configuration
@EnableTransactionManagement
public class DruidDataSourceConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
        DataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}
