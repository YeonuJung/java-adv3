package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

    public static List<String> map(List<String> list, StringFunction function){
        ArrayList<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(function.apply(s));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);
        // 1. 대문자 변환
        // 코드 작성
        System.out.println("대문자 변환 결과: " + map(words, (word) -> word.toUpperCase()));
        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        // 코드 작성
        System.out.println("특수문자 데코 결과: " + map(words, (word) -> "***" + word + "***"));
    }
}
