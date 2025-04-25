package lambda.lambda1;

public class SamMain {

    public static void main(String[] args) {
        SamInterface samInterface = () -> System.out.println("hello lambda");
        samInterface.run();

        // 람다 할당 불가(추상 메서드가 하나가 아니라서)
        //NotSamInterface notSamInterface = () -> System.out.println("hello lambda");
        // -> multiple non-overriding abstract methods found in interface lambda.lambda1.NotSamInterface

    }
}
