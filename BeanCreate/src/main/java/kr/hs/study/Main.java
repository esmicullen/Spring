package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean obj1 = ctx.getBean("t1", TestBean.class);
//        TestBean obj2 = ctx.getBean("t2", TestBean.class);
        TestBean obj3 = ctx.getBean("t1", TestBean.class);

        TestBean obj2 = ctx.getBean("t2", TestBean.class);

        System.out.println("obj1 : " + obj1);
        System.out.println("obj2 : " + obj2);
        System.out.println("obj3 : " + obj3);


        ctx.close();
        System.out.println("Hello World!");

    }
}