package kr.hs.study.beans;

public class Main {
    public static void main(String[] args) {
        Music m = new kPop();
        callMethod(m);
    }

    private static void callMethod(Music m) {
        m.sound();
    }
}
