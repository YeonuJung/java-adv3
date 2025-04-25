package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {

    public static void main(String[] args) {
        // 타입 생략 전
        MyFunction funtion1 = (int a, int b) -> a + b;
        funtion1.apply(1, 2);
        // 함수형 인터페이스 타입을 통해 타입 추론 가능, 타입 생략 후
        MyFunction function2 = (a, b) -> a + b;
        function2.apply(1, 2);
    }
}
