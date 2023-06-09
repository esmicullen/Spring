package kr.hs.study.beans;

import lombok.Data;

@Data
public class TestBean1 {
    public TestBean1() {

    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public double getData2() {
        return data2;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    private int data1;
    private double data2;
    private String data3;



    public TestBean1(int data1, double data2, String data3){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public void sayData(){
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        System.out.println("data3 : " + data3);
    }
}
