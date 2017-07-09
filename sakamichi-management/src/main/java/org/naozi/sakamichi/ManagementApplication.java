package org.naozi.sakamichi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by Naozi on 2017/6/30.
 */
@ServletComponentScan
@MapperScan("org.naozi.sakamichi.dao.mapper")
@SpringBootApplication
public class ManagementApplication {
    public static void main(String[] args){
        SpringApplication.run(ManagementApplication.class,args);
    }
}