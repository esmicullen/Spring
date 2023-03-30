package kr.hs.study;

import kr.hs.study.beans.Kpop;
import kr.hs.study.beans.Music;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Kpop obj1 = ctx.getBean("m1", Kpop.class);
        Music obj = ctx.getBean("m1", Music.class);
        obj.sound();


        System.out.println("Hello");
    }
}