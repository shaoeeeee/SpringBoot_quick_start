package com.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//标注声明该类是一个SpringBoot引导类
@SpringBootApplication
public class MySpringBoot {

    public static void main(String[] args) {
        //run标识运行SpringBoot引导类 run参数就是SpringBoot引导类的字节码对象
        SpringApplication.run(MySpringBoot.class,args);
    }

}

