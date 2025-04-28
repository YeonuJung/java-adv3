package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamLoopMain {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("김철수", 100),
                new Student("정문홍", 80),
                new Student("이맹구", 50),
                new Student("신짱구", 40),
                new Student("가나다라마", 90)

        );

        // 점수가 80점 이상인 학생들 이름
        List<String> result = MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(n -> n.getName())
                .toList();

        // 외부 반복
        for (String s : result) {
            System.out.println("name = " + s);
        }

        // 추가
        // 점수가 80점 이상인 학생들 이름
        MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(n -> n.getName())
                .forEach(n -> System.out.println("name = " + n));
    }
}
