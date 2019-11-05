package com.xzh.clothes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@ComponentScan(basePackages={"com.xzh"})//扫描注解元素
@MapperScan("com.xzh.clothes")//Mybatis的DAO所在包
public class ClothesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClothesApplication.class, args);
    }

}
