package kr.hs.study.beans;

public class TestBean4 {
    public TestBean4() {
        System.out.println("TestBea4의 기본생성자");
    }

    public void init (){
        System.out.println("TestBea4의 init-method");
    }

    public void destroy(){
        System.out.println("TestBea4의 destroy-method");
    }
}
