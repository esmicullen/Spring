public class MainClass {
    public static void main(String[] args) {
        //HelloWorldEn h = new HelloWorldEn();
        HelloWorldKr h = new HelloWorldKr();
        callMethod(h);
    }
    static void callMethod(HelloWorldKr hello){
        hello.sayHello();
    }

}
