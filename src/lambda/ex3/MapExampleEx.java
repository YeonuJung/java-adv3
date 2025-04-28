package lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapExampleEx {

    public static List<String> map(List<String> list, UnaryOperator<String> operator) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : list) {
            String mappedResult = operator.apply(s);
            result.add(mappedResult);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);
        // 1. 대문자 변환
        List<String> upperList = map(words, s -> s.toUpperCase());
        System.out.println("대문자 변환 결과: " + upperList);
        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        List<String> decoratedList = map(words, s -> "***" + s + "***");
        System.out.println("특수문자 데코 결과: " + decoratedList);
    }
}
