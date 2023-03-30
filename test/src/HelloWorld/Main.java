package HelloWorld;

public class Main  {
    public static void main(String[] args) {
        HelloWorld h = new HelloWorldEn();
        callMethod(h);
    }

    static void callMethod(HelloWorld h){
        h.sayHello();
    }
}
