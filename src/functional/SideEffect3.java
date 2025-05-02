package functional;

import java.util.function.Function;

public class SideEffect3 {

    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> x * 2;
        int x = 10;
        Integer result = func.apply(x);

        // 부수 효과는 순수 함수와 분리해서 실행
        System.out.println("x = " + x + ", result = " + result);


    }
}
