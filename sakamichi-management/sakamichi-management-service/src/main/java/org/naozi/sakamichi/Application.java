package org.naozi.sakamichi;

import org.mybatis.spring.annotation.MapperScan;
import org.naozi.sakamichi.config.druid.DruidStatViewServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

/**
 * Created by Naozi on 2017/6/30.
 */
@ServletComponentScan
@MapperScan("org.naozi.sakamichi.dao.mapper")
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
