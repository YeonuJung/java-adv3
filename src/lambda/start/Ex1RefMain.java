package lambda.start;

import java.util.Random;

// 인스턴스 참조 전달(인터페이스 다형성 사용)
public class Ex1RefMain {

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());

    }
    public static void hello(Executor executor){
        long startNs = System.nanoTime();
        //코드 조각 시작
        executor.execute();
        //코드 조각 종료
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    static class Sum implements Executor{
        @Override
        public void execute() {
            //코드 조각 시작
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
            //코드 조각 종료
        }
    }
    static class Dice implements Executor{
        @Override
        public void execute() {
            //코드 조각 시작
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
            //코드 조각 종료
        }
    }

}
