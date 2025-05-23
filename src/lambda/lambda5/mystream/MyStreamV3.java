package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// static factory 추가
public class MyStreamV3<T>{

    private List<T> internalList;

    private MyStreamV3(List<T> internalList) {
        this.internalList = internalList;
    }

    // static factory(인스턴스를 생성해주는 정적 메서드)
    public static <T> MyStreamV3<T> of(List<T> internalList) {
        return new MyStreamV3(internalList);
    }

    public MyStreamV3<T> filter(Predicate<T> predicate){
        List<T> filtered = new ArrayList<>();
        for (T i : internalList) {
            if(predicate.test(i)){
                filtered.add(i);
            }
        }
        return MyStreamV3.of(filtered);
    }

    public <R> MyStreamV3<R> map(Function<T, R> mapper){
        List<R> mapped = new ArrayList<>();
        for (T i : internalList) {
            mapped.add(mapper.apply(i));
        }
        return MyStreamV3.of(mapped);
    }

    public List<T> toList(){
        return internalList;
    }

    // 추가
    public void forEach(Consumer<T> consumer){
        for (T element : internalList) {
            consumer.accept(element);
        }
    }

    // 추가
    public T getFirst(){
        return internalList.get(0);
    }
}
