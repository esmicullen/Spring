package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 tb1 = ctx1.getBean("t1", TestBean1.class);
       tb1.sayData();

       TestBean1 tb2 = ctx1.getBean("t2", TestBean1.class);
       tb2.sayData();

        ctx1.close();
        System.out.println("=============================================================================");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 obj1 = ctx2.getBean("java1", TestBean1.class);
        obj1.sayData();

        TestBean1 obj2 = ctx2.getBean("java2", TestBean1.class);
        obj2.sayData();

        ctx2.close();
    }
}