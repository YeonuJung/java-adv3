package methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV3 {

    public static void main(String[] args) {
        BinaryOperator<Integer> add = MethodRefStartV3::add;

        Integer result1 = add.apply(1, 2);
        System.out.println("result1 = " + result1);

        Integer result2 = add.apply(1, 2);
        System.out.println("result2 = " + result2);
    }

    static int add(int a, int b){
        return a + b;
    }
}
