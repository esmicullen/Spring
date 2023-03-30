package kr.hs.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Person tp1 = ctx.getBean("p1", Person.class);
        tp1.pf();

        Person tp2 = ctx.getBean("p2", Person.class);
        tp2.pf();
    }
}