package org.naozi.sakamichi.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by Naozi on 2017/6/30.
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:mybatis/mybatis.properties")
@ImportResource({ "classpath:mybatis/mybatis-config.xml" })
public class DruidDataSourceConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
        DataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}
