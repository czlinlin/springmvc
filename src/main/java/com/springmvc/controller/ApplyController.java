package com.springmvc.controller;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.applet.AppletContext;

@Controller
@RequestMapping("apply")
public class ApplyController {

//    @RequestMapping("p1")
//    public String person1() {
//        return "1";
//    }
//
//    @RequestMapping("p2")
//    public String person2() {
//        return "2";
//    }

    public static  void  main(String args[]){
//        ApplicationContext act = new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
//        Person bean =(Person) act.getBean("person");
//        System.out.println(bean);

    ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(MainConfig.class);
      Person person = (Person)  applicationContext.getBean("person");
        System.out.println(person);
    }

}
