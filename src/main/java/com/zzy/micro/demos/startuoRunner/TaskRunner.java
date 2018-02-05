package com.zzy.micro.demos.startuoRunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.Annotation;

//@Order(2)

/**
 *
 *项目启动后，默认执行实现ApplicationRunner接口的run方法的Bean
 * 实现Ordered接口的getOrder() 方法，可以进行优先级排序
 * @author zhangzy
 */
public class TaskRunner implements ApplicationRunner , Ordered {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("TaskRunner'level is 2");
    }


    @Override
    public int getOrder() {
        return 2;
    }
}
