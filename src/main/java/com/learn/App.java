package com.learn;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.learn.mapper")//用于扫描mybatis的Mapper接口
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
