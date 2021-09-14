package przetwarzanieKolekcji;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStream {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);

//        liczba kwadratów kolejnych 100 liczb
        List<Integer> squareNumber = numStream.map(x -> x * x)
                .limit(100)
                .collect(Collectors.toList());

        TreeSet<Integer> biggerThan5 = squareNumber.stream()
                .filter(x -> x % 10 == 0)
                .map(x -> x / 10)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareNumber.forEach(x -> System.out.print(x + " ; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x -> System.out.print(x + " ; "));

    }
}
