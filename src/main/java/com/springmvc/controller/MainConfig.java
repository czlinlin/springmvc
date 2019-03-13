package com.springmvc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类，等同于配置文件
@Configuration   //告诉spring  这是一个配置类
public class MainConfig {


    @Bean //容器中注册一个bean，相当于配置文件中的bean标签
    public Person person (){
        return  new Person("lisa",20);
    }
}
