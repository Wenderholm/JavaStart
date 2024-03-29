package przetwarzanieKolekcji;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberSteram3 {
    private static final int DIVIDER = 10;

    public static void main(String[] args) {
        // lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = IntStream.range(0,  100)
                .map(NumberSteram3::square)
                .boxed()
                .collect(Collectors.toList());
        //zbiór kwadratów liczb
        Set<Integer> biggerThan15 = squareNumbers.stream()
                .filter(NumberSteram3::isDividedBy)
                .map(NumberSteram3::divide)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareNumbers.forEach(x -> System.out.print(x + " ; "));
        System.out.println("\nSet");
        biggerThan15.forEach(x -> System.out.print(x + " ; "));

    }
    private static int square(int x) {
        return x * x;
    }

    private static boolean isDividedBy(int x) {
        return x % DIVIDER == 0;
    }

    private static int divide(int x) {
        return x / DIVIDER;
    }
}
