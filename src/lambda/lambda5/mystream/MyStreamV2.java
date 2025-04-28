package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// static factory 추가
public class MyStreamV2 {

    private List<Integer> internalList;

    private MyStreamV2(List<Integer> internalList) {
        this.internalList = internalList;
    }

    // static factory(인스턴스를 생성해주는 정적 메서드)
    public static MyStreamV2 of(List<Integer> internalList) {
        return new MyStreamV2(internalList);
    }

    public MyStreamV2 filter(Predicate<Integer> predicate){
        List<Integer> filtered = new ArrayList<>();
        for (Integer i : internalList) {
            if(predicate.test(i)){
                filtered.add(i);
            }
        }
        return new MyStreamV2(filtered);
    }

    public MyStreamV2 map(Function<Integer, Integer> mapper){
        List<Integer> mapped = new ArrayList<>();
        for (Integer i : internalList) {
            mapped.add(mapper.apply(i));
        }
        return new MyStreamV2(mapped);
    }

    public List<Integer> toList(){
        return internalList;
    }
}
