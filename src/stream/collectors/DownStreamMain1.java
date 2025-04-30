package stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownStreamMain1 {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(
                        "Jung",
                        1,
                        85
                ),
                new Student(
                        "Park",
                        2,
                        75
                ),
                new Student(
                        "Lee",
                        1,
                        95
                ),
                new Student(
                        "Han",
                        2,
                        65
                ),
                new Student(
                        "Yoon",
                        3,
                        75
                ),
                new Student(
                        "Hong",
                        3,
                        65
                )
                                        );
        // 1단계: 학년별로 학생들을 그룹화 해라.
        Map<Integer, List<Student>> collect1 = students.stream()
                                                       .collect(Collectors.groupingBy(
                                                               s -> s.getGrade(),
                                                               Collectors.toList()
                                                                                     ));
        System.out.println("collect1 = " + collect1);
        // 다운 스트림을 생략하면 toList() 가 들어감
        Map<Integer, List<Student>> collect2 = students.stream()
                                                       .collect(Collectors.groupingBy(s -> s.getGrade()));
        System.out.println("collect2 = " + collect2);

        // 2단계: 학년별로 학생들의 이름을 출력해라.
        Map<Integer, List<String>> collect3 = students.stream()
                                                      .collect(Collectors.groupingBy(
                                                              Student::getGrade,
                                                              Collectors.mapping(
                                                                      s -> s.getName(),
                                                                      Collectors.toList()
                                                                                )
                                                                                    ));
        System.out.println("collect3 = " + collect3);

        // 3단계: 학년별로 학생들의 수를 출력해라.
        Map<Integer, Long> collect4 = students.stream()
                                              .collect(Collectors.groupingBy(
                                                      Student::getGrade,
                                                      Collectors.counting()
                                                                            ));
        System.out.println("collect4 = " + collect4);

        // 4단계: 학년별로 학생들의 평균 성적 출력해라
        Map<Integer, Double> collect5 = students.stream()
                                                .collect(Collectors.groupingBy(
                                                        Student::getGrade,
                                                        Collectors.averagingInt(Student::getScore)
                                                                              ));
        System.out.println("collect5 = " + collect5);
    }
}
