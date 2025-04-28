package lambda.lambda4;

public class TriMain {

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (i1, i2, i3) -> i1 + i2 + i3;
        System.out.println("SUM = " + triFunction.apply(1, 2, 3));
    }
    @FunctionalInterface
    interface TriFunction<A, B, C, R>{
        public R apply(A a, B b, C c);
    }
}
