package streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws FileNotFoundException {
//        przykładowo stworzone strumienie
//        Stream<String> stream = Stream.of("a", "b", "c");
//        Stream<Integer> numberStream = Stream.of(1,2,3,4,5);

        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
//
////        wwyfiltrowane liczby parzyste
//        IntStream evenStream = stream.filter(x -> x % 2 != 0);
//
////        zebranie przefiltrowanych liczb
//        int[] evenNumber = evenStream.toArray();
//        System.out.println(Arrays.toString(evenNumber));


//        zapisanie powyższego w skrócie

//        int[] evenNumber = stream
//                .filter(x -> x % 2 == 0)
//                .toArray();
//        System.out.println(Arrays.toString(evenNumber));

//    MAPOWANIE PO STRUMIENIACH
//        Stream<String> letters = Stream.of("a", "b", "c");
//        String[] upperCaseLetter = letters.map(s -> s.toUpperCase()).
//                toArray(String[]::new);
//        System.out.println(Arrays.toString(upperCaseLetter));
//    }

//    STRUMIENIE WYPISYWANIA LIST
//        IntStream numStream = IntStream.iterate(0, x -> x + 1);
//        IntStream limitedNumber = numStream.limit(100);
//        int[] numbers = limitedNumber.toArray();
//        System.out.println(Arrays.toString(numbers));

//        zamist powyzszych dwóch linii mozemy zapisac tak:
//        IntStream numStream = IntStream.rangeClosed(0,99);
//        int[] numbers = numStream.toArray();
//        System.out.println(Arrays.toString(numbers));

// wypisanie liczb od 0 do 100, podniesienie każdej do potęgi, wyfiltrowanie parzystych
//        int[] numbers = IntStream.iterate(0, x -> x + 1)
//                .limit(100)
//                .map(x -> x*x)
//                .filter(x -> x % 2 == 0)
//                .toArray();
//        System.out.println(Arrays.toString(numbers));

//        WCZYTYWANIE
        Scanner scanner = new Scanner(new File("file.txt"));
        scanner.tokens()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
