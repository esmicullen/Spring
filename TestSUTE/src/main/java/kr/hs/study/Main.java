package kr.hs.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ문제 1번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        StrQ1 cq1 = ctx.getBean("s1", StrQ1.class);

        System.out.println("순서 변경해서 얍! : " + cq1.getM2() + " , " + cq1.getM1());

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ문제 2번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        IQ1 qi1 = ctx.getBean("i1", IQ1.class);

        System.out.println("세 수의 합 : " + qi1.a + " + "+ qi1.b + " + "+ qi1.c + " = " + (qi1.a + qi1.b + qi1.c));
        System.out.println("세 수의 평균 : (" + qi1.a + " + "+ qi1.b + " + "+ qi1.c + " ) / 3 = " + (qi1.a + qi1.b + qi1.c)/3);

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ문제 3번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        IQ2 qi2 = ctx.getBean("i2",IQ2.class);
        System.out.print(qi2.a + "," + qi2.b +" 두 수의  크기 비교 : ");
        if (qi2.a > qi2.b){
            System.out.println("1");
        } else if (qi2.a < qi2.b) {
            System.out.println("0");
        }else {
            System.out.println("a==b");
        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ문제 4번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        IQ3 qi3 = ctx.getBean("i3", IQ3.class);
        if(qi3.a % 2 == 0) {
            System.out.println(qi3.a + "는 짝수입니다.");
        }else if(qi3.b % 2 == 0) {
            System.out.println(qi3.b + "는 짝수입니다.");
        }else if(qi3.c % 2 == 0) {
            System.out.println(qi3.c + "는 짝수입니다.");
        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ문제 5번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        IQ4 qi4 = ctx.getBean("i4", IQ4.class);
        int a =0, b = 0;
        a = qi4.a/10;
        b = qi4.a % 10;
        if (a == b) {
            System.out.println(qi4.a + "의 1의 자리와 10의 자리는 같습니다");
        }else {
            System.out.println(qi4.a + "의 1의 자리와 10의 자리는 다릅니다.");
        }
        a = qi4.b/10;
        b = qi4.b % 10;
        if (a == b) {
            System.out.println(qi4.b + "의 1의 자리와 10의 자리는 같습니다");
        }else {
            System.out.println(qi4.b + "의 1의 자리와 10의 자리는 다릅니다.");
        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ문제 6번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        IQ5 qi5 = ctx.getBean("i5",IQ5.class);
        if(qi5.a+qi5.b >qi5.c || qi5.b+qi5.c >qi5.a || qi5.c+qi5.a >qi5.b){
            System.out.println("삼각형이 가능합니다");
        }else {
            System.out.println("삼각형이 불가능합니다");
        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ문제 7번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        IQ6 qi6 = ctx.getBean("i6", IQ6.class);

        int su[] = {qi6.a, qi6.b, qi6.c, qi6.d, qi6.e};
        int jum[] =  new int[11];

        for(int i = 0; i<jum.length; i++){
            jum[i] = 0;
        }

        for(int i = 0; i<su.length; i++){
            if (su[i] == 100) {
                jum[10]++;
            } else if (su[i] >= 90){
                jum[9] ++;
            }else if (su[i] >= 80){
                jum[8] ++;
            }else if (su[i] >= 70){
                jum[7] ++;
            }else if (su[i] >= 60){
                jum[6] ++;
            }else if (su[i] >= 50){
                jum[5] ++;
            }else if (su[i] >= 40){
                jum[4] ++;
            }else if (su[i] >= 30){
                jum[3] ++;
            }else if (su[i] >= 20){
                jum[2] ++;
            }else if (su[i] >= 10){
                jum[1] ++;
            }else if (su[i] >= 0){
                jum[0] ++;
            } else {
                System.out.println("잘못된 점수입니다.");
            }
        }

        System.out.println("0점~ 9점 : " + jum[0]);
        System.out.println("10점~ 19점 : " + jum[1]);
        System.out.println("20점~ 29점 : " + jum[2]);
        System.out.println("30점~ 39점 : " + jum[3]);
        System.out.println("40점~ 49점 : " + jum[4]);
        System.out.println("50점~ 59점 : " + jum[5]);
        System.out.println("60점~ 69점 : " + jum[6]);
        System.out.println("70점~ 79점 : " + jum[7]);
        System.out.println("80점~ 89점 : " + jum[8]);
        System.out.println("90점~ 99점 : " + jum[9]);
        System.out.println("100점: " + jum[10]);


        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ문제 8번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        IQ7 qi7 = ctx.getBean("i7", IQ7.class);
        int sus[] = {qi7.a, qi7.b, qi7.c, qi7.d, qi7.e};
        int max = -1, min = sus[1];

        for(int i = 0; i < sus.length; i++){
            if (sus[i] <= min ){
                min = sus[i];
            }
            if (sus[i] >= max ){
                max = sus[i];
            }
        }

        System.out.println("최대 점수 : " + max + " , 최저 점수 : " + min );

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ문제 9번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        IQ8 qi8 = ctx.getBean("i8", IQ8.class);
        int susu[] = {qi8.a, qi8.b, qi8.c, qi8.d, qi8.e};
        int sum = 0, cnt = 0;
        for(int i = 0 ; i< susu.length; i++){
            if( susu[i] >= 20 && susu[i] <=50){
                sum += susu[i];
                cnt++;
            }
        }

        System.out.println("합계 : " + sum + " 평균  : " + (sum/cnt));

    }
}