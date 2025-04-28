package lambda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiMain {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (i1, i2) -> i1 + i2;
        System.out.println("SUM = " + biFunction.apply(1, 2));

        BinaryOperator<Integer> binaryOperator = (i1, i2) -> i1 + i2;
        System.out.println("SUM = " + binaryOperator.apply(1, 2));


        BiConsumer<Integer, Integer> biConsumer = (i1, i2) -> System.out.println(i1 + " + " + i2 + " = " + (i1 + i2));
        biConsumer.accept(1, 2);

        BiPredicate<Integer, Integer> biPredicate = (i1, i2) -> i1 > i2;
        System.out.println("First arg is bigger? = " + biPredicate.test(1, 2));
    }
}
