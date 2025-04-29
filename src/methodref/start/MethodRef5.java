package methodref.start;

import lambda.lambda5.mystream.MyStreamV3;
import methodref.Person;

import java.util.List;

public class MethodRef5 {

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Jung"),
                new Person("Kim"),
                new Person("Lee"));

        List<String> result1 = MyStreamV3.of(personList).map((Person person) -> person.introduce()).map(str -> str.toUpperCase()).toList();
        System.out.println("result1 = " + result1);

        List<String> result2 = MyStreamV3.of(personList).map(Person::introduce).map(String::toUpperCase).toList();
        System.out.println("result2 = " + result2);
    }

}
