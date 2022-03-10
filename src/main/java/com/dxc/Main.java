package com.dxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
       // ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigClass.class);//calling config class
        Company company= ac.getBean("company",Company.class);
        company.showHistory();
        company.engineer.development();

    }
}
