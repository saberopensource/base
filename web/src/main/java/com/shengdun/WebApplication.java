package com.shengdun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author baiyang
 * @Email: 1419408386@qq.com
 * @DATE : 2018-10-23
 * @MESSAGE: 如果看不懂先debug，不知道就来问我
 */
@ComponentScan({"com.shengdun"})
@MapperScan(basePackages = {"com.shengdun.dao"}, sqlSessionFactoryRef = "sqlSessionFactory")
@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
