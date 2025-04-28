package lambda.lambda4;

import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {
        // 익명 클래스
        Predicate<Integer> predicate1 = new Predicate<>(){
            @Override
            public boolean test(Integer i){
                return i % 2 == 0;
            }
        };
        boolean result = predicate1.test(2);
        System.out.println("result = " + result);

        Predicate<Integer> predicate2 = i -> i % 2 == 0;
        boolean result2 = predicate2.test(2);
        System.out.println("result2 = " + result2);
    }
}
