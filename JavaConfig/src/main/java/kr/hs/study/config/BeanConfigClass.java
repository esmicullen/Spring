package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfigClass {

    //<bean id = "java1" class="kr.hs.study.beans.TestBean1"/>
    @Bean
    public TestBean1 java1(){ //메소드 이름이 객체 이름
        TestBean1 t1 = new TestBean1();
        return t1;
    }

    @Bean
    @Scope(value = "prototype")
    public TestBean2 java2(){
       TestBean2 t2 = new TestBean2();
       return t2;
    }

    @Bean
    @Lazy
    public TestBean3 java3(){
        TestBean3 t3 = new TestBean3();
        return t3;
    }

    @Bean(name = "test", initMethod = "init" , destroyMethod = "destroy")
    public TestBean4 java4(){
        TestBean4 t4 = new TestBean4();
        return t4;
    }
}