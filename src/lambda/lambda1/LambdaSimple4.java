package lambda.lambda1;

public class LambdaSimple4 {

    public static void main(String[] args) {
        // 매개변수 괄호 생략 전
        MyCall myCall1 = (value) -> value + 1;
        myCall1.call(2);
        // 매개변수 괄호 생략 후
        MyCall myCall2 = value -> value + 1;
        myCall2.call(2);
    }

    interface MyCall{
        int call(int value);
    }
}
