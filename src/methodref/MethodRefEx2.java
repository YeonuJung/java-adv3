package methodref;

import java.util.function.Function;

public class MethodRefEx2 {

    public static void main(String[] args) {
        // 1. 정적 메서드 참조
        Function<String, String> staticMethod1 = name -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName;
        System.out.println("staticMethod1 = " + staticMethod1.apply("Jung"));
        System.out.println("staticMethod2 = " + staticMethod2.apply("Jung"));

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Jung");
        Function<Integer, String> instanceMethod1 = (number) -> person.introduceWithNumber(number);
        Function<Integer, String> instanceMethod2 = person::introduceWithNumber;

        System.out.println("instanceMethod1 = " + instanceMethod1.apply(12));
        System.out.println("instanceMethod2 = " + instanceMethod2.apply(12));

        // 3. 생성자 참조
        Function<String, Person> newPerson1 = (name) -> new Person(name);
        Function<String, Person> newPerson2 = Person::new;
        // 참조하는 메서드가 동일해도 함수형 인터페이스를 기반으로 추론할 수 있다.

        System.out.println("newPerson1 = " + newPerson1.apply("Jung").getName());
        System.out.println("newPerson2 = " + newPerson2.apply("Jung").getName());
    }
}
