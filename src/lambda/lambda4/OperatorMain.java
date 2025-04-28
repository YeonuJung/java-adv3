package lambda.lambda4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperatorMain {

    public static void main(String[] args) {
        // UnaryOperator
        Function<Integer, Integer> square1 = x -> x * x;
        UnaryOperator<Integer> square2 = x -> x * x;
        System.out.println("square1 = " + square1);
        System.out.println("square2 = " + square2);
        // BinaryOperator
        BiFunction<Integer, Integer, Integer> addition1= (x, y) -> x + y;
        BinaryOperator<Integer> addition2 = (x, y) -> x + y;
        System.out.println("addition1 = " + addition1);
        System.out.println("addition2 = " + addition2);
    }
}
