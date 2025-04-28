package lambda.lambda4;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {
        // 익명 클래스
        Supplier<Integer> supplier = new Supplier<>(){
            @Override
            public Integer get(){
                return new Random().nextInt();
            }
        };
        Integer i = supplier.get();
        System.out.println("i = " + i);

        // 람다
        Supplier<Integer> supplier2 = () -> new Random().nextInt();
        Integer i2 = supplier2.get();
        System.out.println("i2 = " + i2);
    }
}
