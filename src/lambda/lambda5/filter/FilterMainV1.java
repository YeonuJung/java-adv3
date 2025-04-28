package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMainV1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수만 거르기
        List<Integer> evenNumbers = filterEvenNumber(numbers);
        System.out.println("evenNumbers = " + evenNumbers);

        // 홀수만 거르기
        List<Integer> oddNumbers = filterOddNumber(numbers);
        System.out.println("oddNumbers = " + oddNumbers);

    }

    private static List<Integer> filterOddNumber(List<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if(!(number % 2 == 0)) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    private static List<Integer> filterEvenNumber(List<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if(number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
