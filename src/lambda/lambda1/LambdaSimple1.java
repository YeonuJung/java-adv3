package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple1 {

    public static void main(String[] args) {

        // 기본
        MyFunction function1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("function1.apply(1, 2) = " + function1.apply(1, 2));

        // 단일 표현식인 경우 중괄호와 리턴 생략 가능
        MyFunction function2 = (int a, int b) -> a + b;
        System.out.println("function2.apply(1, 2) = " + function2.apply(1, 2));

    }
}
