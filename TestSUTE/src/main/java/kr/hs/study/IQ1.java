package kr.hs.study;

import lombok.Data;

@Data
public class IQ1 {
    int a;
    int b;
    int c;

    IQ1(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
