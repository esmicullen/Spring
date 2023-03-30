package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {

    @Bean
    public TestBean1 java1() {
        TestBean1 t = new TestBean1(2 , 2.2 , "Spring2");
        return t;
    }

    @Bean
    public TestBean1 java2() {
        TestBean1 t = new TestBean1(4, 4.4, "spring4");
        return t;
    }
}

