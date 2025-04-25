package lambda.ex1;

public class M1After {
    public static void main(String[] args) {
        greet("Good Morning!");
        greet("Good Afternoon!");
        greet("Good Evening!");
    }

    public static void greet(String greeting){
        System.out.println("=== 시작 ===");
        System.out.println(greeting);
        System.out.println("=== 끝 ===");
    }
}
