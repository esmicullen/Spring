package kr.hs.study;

public class Person {
    String name;
    int age;
    job career;

    Person(String name) {
        this.name = name;
        this.age = 0;

    }
    Person(int age){
        this.name = "000";
        this.age = age;
    }
    Person(job career){

    }

    public void pf() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
