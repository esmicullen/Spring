import java.util.Date;

public class DI_Strong_Weak {
    public static void main(String[] args){
        Date d = new Date(); //강한 결합 --> 객체 생성
        System.out.println("date : " + d);
    }
    public static void getDate(Date d){ //약한결합 --> 데이트 타입의 d를 주입
        Date date = d;
        System.out.println("date2 : " + d);
    }

    public static void memberUse1(){
        Member m1 = new Member(); //강한 결합 --> 객체 생성
    }

    public static void memberUse2(Member m){ //약한 결합  --> 어딘가에서 만든 멤버를 주입
        Member m2 = m;
    }
}

class Member{
    String name;
    String nickname;
    public Member(){} //만약 private로 변경시 강한결합에 오류발생
}