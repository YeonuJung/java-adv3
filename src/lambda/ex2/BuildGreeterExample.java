package lambda.ex2;

public class BuildGreeterExample {

        // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
        public static StringFunction buildGreeter(String greeting) {
            return  str -> greeting + ", " + str;
        }

        public static void main(String[] args) {
            StringFunction hello = buildGreeter("Hello");
            StringFunction hi = buildGreeter("Hi");

            System.out.println(hello.apply("Java"));
            System.out.println(hi.apply("Lambda"));
        }

}
