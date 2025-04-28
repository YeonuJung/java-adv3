package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV3Main {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("김철수", 100),
                new Student("정문홍", 80),
                new Student("배철수", 50),
                new Student("이짱구", 40),
                   new Student("다섯글자다", 90)

        );

        // 점수가 80점 이상인 학생들 이름
        List<String> result = MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(n -> n.getName())
                .toList();
        System.out.println(result);

        // 점수가 80점 이상이면서, 이름이 5글자인 학생의 이름을 추출해라.
        List<String> result2 = MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .filter(s -> s.getName().length() == 5)
                .map(s -> s.getName())
                .toList();
        System.out.println("result2 = " + result2);
    }

}
