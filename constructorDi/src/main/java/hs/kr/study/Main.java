package hs.kr.study;

import hs.kr.study.beans.DataBean;
import hs.kr.study.beans.TestBean1;
import hs.kr.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 tb1 = ctx.getBean("t1", TestBean1.class);
        tb1.prData();

        TestBean1 tb2 = ctx.getBean("t2", TestBean1.class);
        tb2.prData();

        TestBean1 tb3 = ctx.getBean("t3", TestBean1.class);
        tb3.prData();

        TestBean1 tb4 = ctx.getBean("t4", TestBean1.class);
        tb4.prData();

        TestBean2 tb5 = ctx.getBean("t5", TestBean2.class);
        tb5.prData();

        DataBean d1 = ctx.getBean("d1", DataBean.class);

        System.out.println("Hello world!");
    }
}