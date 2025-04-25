package lambda.lambda2;

import lambda.MyFunction;

// 2. 람다를 메서드(함수)에 전달하기
public class LambdaPassMain2 {

    public static void main(String[] args) {
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;

        // 변수를 통해 전달
        calculate(add, 1, 2);
        calculate(sub, 1, 2);

        // 직접 전달
        calculate((a, b) -> a + b, 1, 2);
        calculate((a, b) -> a - b, 1, 2);

    }

    static void calculate(MyFunction function, int a, int b) {
        int result = function.apply(a, b);
        System.out.println("result = " + result);
    }
}
