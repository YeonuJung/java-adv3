package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        // 최종 연산

        // Collectors 는 뒤에서 더 자세히 (복잡한 수집이 필요할 때 사용)
        System.out.println("1. collect - List 수집");
        List<Integer> evenNumbers1 = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println("짝수 리스트: " + evenNumbers1);
        System.out.println();

        System.out.println("2. toList() - (Java 16+)");
        List<Integer> evenNumbers2 = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .toList();
        // 워낙 Collectors.toList() 를 많이쓰다 보니 toList() 편의 메서드를 제공
        System.out.println("짝수 리스트: " + evenNumbers2);
        System.out.println();

        System.out.println("3. toArray - 배열로 변환");
        Integer[] evenNumbers3 = numbers.stream()
                                        .filter(n -> n % 2 == 0)
                                        .toArray(Integer[]::new);
        // toArray는 IntFunction<T[]> 를 받기 때문에 배열의 사이즈를 받아서 배열을 반환하길 기대
        // 따라서 toArray는 알아서 스트림 내부의 사이즈를 넘겨줌
        System.out.println("짝수 배열: " + Arrays.toString(evenNumbers3));
        System.out.println();


        System.out.println("4. forEach - 각 요소 처리");
        numbers.stream()
               .limit(5)
               .forEach(n -> System.out.println(n + " "));
        System.out.println();

        System.out.println("5. count - 요소 개수");
        long count = numbers.stream()
                            .filter(n -> n > 5)
                            .count();
        System.out.println("5보다 큰 숫자 개수: " + count);
        System.out.println();


        System.out.println("6. count - 요소들을 하나의 값으로 누적");
        System.out.println("초기값이 없는 reduce");
        Optional<Integer> sum1 = numbers.stream()
                                        .reduce((a, b) -> a + b);
        System.out.println("합계 = " + sum1.get());
        System.out.println();


        // 초기값이 있기 때문에 최소한 초기값은 나올 수 있는 구조
        // 따라서 옵셔널이 아니라 값을 반환
        System.out.println("초기값이 있는 reduce");
        int sum2 = numbers.stream()
                          .reduce(100, (a, b) -> a + b);
        System.out.println("합계 = " + sum2);
        System.out.println();


        System.out.println("7. min - 최솟값");
        Optional<Integer> min = numbers.stream()
                                       .min(Integer::compareTo);
        System.out.println("최솟값 = " + min.get());
        System.out.println();


        System.out.println("8. max - 최댓값");
        Optional<Integer> max = numbers.stream()
                                       .max(Integer::compareTo);
        System.out.println("최댓값 = " + max.get());
        System.out.println();


        System.out.println("9. findFirst - 첫 번째 요소");
        Integer firstValue = numbers.stream()
                                    .filter(n -> n > 5)
                                    .findFirst()
                                    .get();
        System.out.println("5보다 큰 첫 번째 숫자 = " + firstValue);
        System.out.println();


        // 멀티스레드 환경에서 사용(순서 상관없이 먼저 찾은 요소를 반환)
        // 여러 쓰레드에서 동시에 접근했을 때 1, 2, 3 순서로 쓰레드가 실행되었다 하더라도
        // 만약 3이 먼저 찾았으면 3에게 반환
        System.out.println("10. findAny - 아무 요소나 하나 찾기");
        Integer any = numbers.stream()
                             .filter(n -> n > 5)
                             .findAny()
                             .get();
        System.out.println("5보다 큰 첫 번째 숫자= " + any);
        System.out.println();


        System.out.println("11. anyMatch - 조건을 만족하는 요소가 하나라도 존재하는지");
        boolean anyMatch = numbers.stream()
                                  .anyMatch(n -> n % 2 == 0);
        System.out.println("짝수를 만족하는 요소가 하나라도 존재하는지? = " + anyMatch);
        System.out.println();

        System.out.println("12. allMatch - 모든 요소가 조건을 만족하는지");
        boolean allMatch = numbers.stream()
                                  .allMatch(n -> n > 0);
        System.out.println("모든 요소가 양수인지? = " + allMatch);
        System.out.println();

        System.out.println("13. noneMatch - 조건을 만족하는 요소가 없는지");
        boolean noneMatch = numbers.stream()
                                   .noneMatch(n -> n > 100);
        System.out.println("조건을 만족하는 요소가 없는지? = " + noneMatch);


    }

}
