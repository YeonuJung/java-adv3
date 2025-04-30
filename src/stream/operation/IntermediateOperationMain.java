package stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11, 12);

        // 중간 연산

        // 1. filter (필터)
        System.out.println("1. filter - 짝수만 선택");
        numbers.stream()
               .filter(x -> x % 2 == 0)
               .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");


        // 2. map (변환)
        System.out.println("2. map - 각 숫자를 제곱");
        numbers.stream()
               .map(x -> x * x)
               .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");


        // 3. distinct (중복 제거)
        System.out.println("3. distinct - 중복 제거");
        numbers.stream()
               .distinct()
               .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");


        // 4. sorted (기본 정렬)
        System.out.println("4. sorted - 기본 정렬");
        Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
              .sorted()
              .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        // 5. sorted (커스텀 정렬)
        System.out.println("5. sorted - 커스텀 정렬");
        Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
              .sorted(Comparator.reverseOrder())
              .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        // 6. peek (중간 확인)
        System.out.println("6. peek - 중간 단계 확인용");
        numbers.stream()
               .peek(x -> System.out.println("before: " + x + ", "))
               .map(x -> x * x)
               .peek(x -> System.out.println("after: " + x))
               .forEach(x -> System.out.print(x + " "));

        // 7. limit (제한)
        System.out.println("7. limit - 처음 5개 요소만");
        numbers.stream()
               .limit(5)
               .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        // 8. skip (생략)
        System.out.println("8. skip - 처음 5개 요소를 건너뛰기 ");
        numbers.stream()
               .skip(5)
               .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        // 9. takeWhile (Java 9+)
        System.out.println("9. takeWhile - 5보다 작은 동안만 선택. 이후에 큰 숫자 나오면 중지");
        numbers2.stream()
                .takeWhile(x -> x < 5)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        // 10. dropWhile (Java 9+)
        System.out.println("10. dropWhile - 5보다 작은 동안만 건너뛰기. 이후에 큰 숫자 나오면 쭉 출력");
        numbers2.stream()
                .dropWhile(x -> x < 5)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

    }
}
