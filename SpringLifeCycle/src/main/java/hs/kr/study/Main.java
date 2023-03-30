package hs.kr.study;

import hs.kr.study.beans.TestBeans1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBeans1 tb = ctx.getBean("tb1", TestBeans1.class);

        ctx.close();
        System.out.println("tb1 : " + tb);

    }
}