package przetwarzanieKolekcji;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//TREŚĆ ZADANIA
//        W załączniku znajduje się plik z tekstem lorem ipsum. Wczytaj wszystkie słowa osobno do listy słów, a następnie wykorzystując strumienie:
//        usuń wszystkie przecinki i kropki doklejone do słów,
//        wyświetl liczbę słów rozpoczynających się znakiem "s" oraz ile słów składa się z 5 znaków.

//   1 SPOSÓB WYKONANIA ZADANIA
//public class LoremIpsum {
//    public static void main(String[] args) throws IOException {
//        final String fileName = "loremipsum.txt";
//        var reader = new BufferedReader(new FileReader(fileName));
//        List<String> words = new ArrayList<>();
//        String temp = null;
//
//        while((temp = reader.readLine())!=null){
//            words.addAll(Arrays.asList(temp.split(" ")));
//        }
//
//        words = words.stream()
//                .map(s -> s.replaceAll(",","").replaceAll("\\.",""))
//                .collect(Collectors.toList());
//
//        long countSWords = words.stream()
//                .filter(s -> s.startsWith("s"))
//                .peek(s -> System.out.println(s + " "))
//                .count();
//        System.out.println();
//
//        long fiveLetter = words.stream()
//                .filter(s -> s.length() == 5)
//                .peek(s -> System.out.println(s + " "))
//                .count();
//        System.out.println();
//
//        System.out.println("Liczba wyrazów na 's': " + countSWords);
//        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetter);
//        reader.close();
//
//    }
//}
    //   2 SPOSÓB WYKONANIA ZADANIA

//class LoremIpsum {
//    public static void main(String[] args) throws IOException {
//        final String fileName = "loremipsum.txt";
//        var reader = new BufferedReader(new FileReader(fileName));
//
//        List<String> words = reader.lines()
//                .map(line -> line.split(" "))
//                .flatMap(Arrays::stream)
//                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
//                .collect(Collectors.toList());
//
//        long countSWords = words.stream()
//                .filter(s -> s.startsWith("s"))
//                .peek(s -> System.out.print(s + " "))
//                .count();
//        System.out.println();
//
//        long fiveLetters = words.stream()
//                .filter(s -> s.length() == 5)
//                .peek(s -> System.out.print(s + " "))
//                .count();
//        System.out.println();
//
//        System.out.println("Liczba wyrazów na 's': " + countSWords);
//        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);
//
//        reader.close();
//    }
//}

//   3 SPOSÓB WYKONANIA ZADANIA
class LoremIpsum {
    public static void main(String[] args) {
        final String fileName = "loremipsum.txt";

        List<String> words = null;
        try {
            words = readFile(fileName);
            showWordStats(words);
        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku " + fileName);
        }
    }

    private static void showWordStats(List<String> words) {
        long countSWords = words.stream()
                .filter(s -> s.startsWith("s"))
//                .peek(System.out::println)
                .count();

        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
//                .peek(System.out::println)
                .count();

        System.out.println("Liczba wyrazów na 's': " + countSWords);
        System.out.println("Liczba wyrazów z 5 znakami: " + fiveLetters);
    }

    private static List<String> readFile(String fileName) throws IOException {
        try(var reader = new BufferedReader(new FileReader(fileName))) {
            List<String> words = new ArrayList<>();
            return reader.lines() //Stream<String>
                    .map(line -> line.split(" ")) //Stream<String[]>
                    .flatMap(Arrays::stream) //Stream<String>
                    .map(s -> s.replaceAll(",", "").replaceAll("\\.", "")) //Stream<String>
                    .collect(Collectors.toList());
        }
    }
}