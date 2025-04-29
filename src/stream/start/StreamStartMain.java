package stream.start;

import java.util.List;
import java.util.stream.Stream;

public class StreamStartMain {

    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");

        // "B"로 시작하는 이름만 필터 후 대문자로 바꿔서 리스트 수집
        Stream<String> stream = names.stream();
        List<String> list = stream
                .filter(n -> n.startsWith("B"))
                .map((n) -> n.toUpperCase())
                .toList();
        System.out.println(list);

        System.out.println("=== forEach, 내부 반복===");
        names.stream()
                .filter(n -> n.startsWith("B"))
                .map((n) -> n.toUpperCase())
                .forEach(s -> System.out.println(s));

        System.out.println("=== 메서드 참조 ===");
        names.stream()
                .filter(n -> n.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
