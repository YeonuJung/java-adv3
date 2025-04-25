package lambda.lambda1;

import lambda.Procedure;

public class InstanceMain {

    public static void main(String[] args) {
        Procedure procedure = () -> System.out.println("Hello! lambda!");

        procedure.run();

        System.out.println("lambda.class = " + procedure.getClass());
        System.out.println("lambda.instance = " + procedure);
    }
}
