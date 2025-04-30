package stream.collectors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {

    public static void main(String[] args) {
        // 기본 기능

        // 가변 리스트 반환
        List<String> list = Stream.of("Java", "Spring", "JPA")
                                  .collect(Collectors.toList());
        System.out.println("list = " + list);

        // 불변 리스트 반환
        List<String> unmodifiableList = Stream.of("Java", "Spring", "JPA")
                                              .collect(Collectors.toUnmodifiableList());
        System.out.println("unmodifiableList = " + unmodifiableList);
        // unmodifiableList.add(4); -> UnsupportedOperationException

        // Set으로 반환(중복 제거)
        Set<Integer> set = Stream.of(1, 2, 2, 3, 3, 3)
                                 .collect(Collectors.toSet());
        System.out.println("set = " + set);

        // 타입 지정(직접 구현체를 지정 -> toList, toSet은 어떤 구현체로 할지 명시할 수 없음)
        Collection<Integer> treeSet = Stream.of(3, 4, 5, 2, 1)
                                            .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("treeSet = " + treeSet);

    }
}
