package kr.hs.study;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 tb1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("data1 : " + tb1.getData1());
        System.out.println("data2 : " + tb1.getData2());

        TestBean2 tb2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("data3 : " + tb2.getData3());
        System.out.println("data4 : " + tb2.getData4());

        ctx.close();
    }
}