package lambda.lambda3;

public class TargetType1 {

    public static void main(String[] args) {
        FunctionA functionA = (i) -> "value = " + i;
        FunctionA functionB = (i) -> "value = " + i;

        // 람다 직접 대입은 문제 없음.
        // 하지만 이미 만들어진 인스턴스를 다른 인스턴스에 대입하는 건 불가능
        // 형태는 똑같아도 타입이 엄연히 다른 것
    }

    @FunctionalInterface
    interface  FunctionA{
        String apply(Integer i);
    }

    @FunctionalInterface
    interface  FunctionB{
        String apply(Integer i);
    }
}
