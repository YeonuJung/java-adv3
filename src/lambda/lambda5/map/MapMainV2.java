package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> toNumber = map(list, s -> Integer.valueOf(s));
        System.out.println(toNumber);

        // 문자열의 길이 반환
         List<Integer> toLength = map(list, s -> s.length());
        System.out.println(toLength);
    }

    private static List<Integer> map(List<String> list, Function<String, Integer> function) {
        ArrayList<Integer> mapped = new ArrayList<>();
        for (String s : list) {
            mapped.add(function.apply(s));
        }
        return mapped;
    }
}
