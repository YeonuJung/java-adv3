package lambda.lambda5.map;

import java.util.List;

public class MapMainV4 {

    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "orange");

        // 문자열을 대문자로 변환
        List<String> upperFruits = GenericMapper.map(list, s -> s.toUpperCase());
        System.out.println(upperFruits);

        // 문자열의 길이 반환
         List<Integer> lengthFruits = GenericMapper.map(list, s -> s.length());
        System.out.println(lengthFruits);

        // Integer -> String
        List<Integer> integers = List.of(1, 2, 3);
        List<String> startList = GenericMapper.map(integers, n -> "*".repeat(n));
        System.out.println(startList);
    }
}
