package com.spring01.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Secret
 * @create 2021-06-11 下午 02:12
 */
public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring01.xml");
        Computer computer = (Computer) context.getBean("computer");
        computer.start();
    }
}
