package lambda.ex3;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceExample {
    public static int reduce(List<Integer> list, int initialValue, BinaryOperator<Integer> accumulator) {
        int result = initialValue;
        for (Integer i : list) {
            result = accumulator.apply(result, i);
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);
        // 1. 합 구하기 (초깃값 0, 덧셈 로직)
        int sum = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("합(누적 +): " + sum);
        // 2. 곱 구하기 (초깃값 1, 곱셈 로직, 람다로 작성)
        int product = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("곱(누적 *): " + product);
    }
}
