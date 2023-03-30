package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================XML 파일 생성자======================================");

        System.out.println();

        ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("config.xml");

        System.out.println();

        System.out.println("=====================JAVA 파일 생성자======================================");

        System.out.println();

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        System.out.println();

        System.out.println("===========================TestBean1=====================================");

        System.out.println();

        TestBean1 tb1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("t1 : " + tb1);

        System.out.println();

        TestBean1 obj1 = ctx2.getBean("java1", TestBean1.class);
        System.out.println("obj1 : " + obj1);

        System.out.println();

        System.out.println("===========================TestBean2=====================================");

        System.out.println();

        TestBean2 tb2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("t2 : " + tb2);

        System.out.println();

        TestBean2 tb21 = ctx.getBean("t2", TestBean2.class);
        System.out.println("t21 : " + tb21);

        System.out.println();

        TestBean2 obj2 = ctx2.getBean("java2", TestBean2.class);
        System.out.println("obj2 : " + obj2);
        TestBean2 obj21 = ctx2.getBean("java2", TestBean2.class);
        System.out.println("obj21 : " + obj21);

        System.out.println();

        System.out.println("===========================TestBean3=====================================");

        System.out.println();

        TestBean3 tb3 = ctx.getBean("t3" , TestBean3.class);
        System.out.println("t3 : " + tb3);

        System.out.println();

        TestBean3 obj3 = ctx2.getBean("java3", TestBean3.class);
        System.out.println("obj3 : " + obj3);

        System.out.println();

        System.out.println("===========================TestBean4=====================================");

        System.out.println();

        TestBean4 tb4 = ctx.getBean("t4", TestBean4.class);
        System.out.println("t4" + tb4);

        System.out.println();

        TestBean4 obj4 = ctx2.getBean("test", TestBean4.class);
        System.out.println("obj4 : " + obj4);

        System.out.println();



        ctx.close();
        ctx2.close();
    }
}