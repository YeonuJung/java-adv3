package lambda.start;

public class Ex0Main {


    public static void helloJava() {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        System.out.println("Hello Java"); // 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }
    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Spring");
        System.out.println("프로그램 종료");
    }

    public static void hello(String name){
        System.out.println("프로그램 시작");
        System.out.println("Hello " + name);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloJava();
        helloSpring();
}
}
