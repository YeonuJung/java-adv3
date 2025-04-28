package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV4 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 숫자 사용 필터
        List<Integer> evenNumbers = GenericFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);
        List<Integer> oddNumbers = GenericFilter.filter(numbers, n -> n % 2 != 0);
        System.out.println("oddNumbers = " + oddNumbers);

        // 문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        List<String> result = GenericFilter.filter(strings, s -> s.length() >= 2);
        System.out.println("result = " + result);
    }
}
