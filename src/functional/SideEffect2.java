package functional;

import java.util.function.Function;

public class SideEffect2 {

    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> {
            int result = x * 2;

            // 부수 효과
            System.out.println("x = " + x + ", result = " + (x * 2));
            return result;
        };

        func.apply(10);
        func.apply(10);
        func.apply(10);
        func.apply(10);
        func.apply(10);
        func.apply(10);

    }
}
