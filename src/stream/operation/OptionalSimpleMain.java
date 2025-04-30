package stream.operation;

import java.util.Optional;

public class OptionalSimpleMain {

    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.of(10);
        System.out.println("optional1 = " + optional1);

        // 값이 있는지 확인할 수 있는 안전한 메서드 제공
        if (optional1.isPresent()) {
            System.out.println("optional1 = " + optional1.get());
        }

        // 옵셔널 객체를 생성할 때 null을 허용할 때(null이면 Optional.empty 반환)
        Optional<Object> optional2 = Optional.ofNullable(null);
        System.out.println("optional2 = " + optional2);
        if (optional2.isPresent()) {
            System.out.println("optional2 = " + optional2.get());
        }

        // 값이 없는 Optional에서 get()을 호출하면 NoSuchElementException 발생
        // Object o2 = optional2.get();
        //  System.out.println("o2 = " + o2);

    }
}
