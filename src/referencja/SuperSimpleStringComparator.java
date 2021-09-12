package referencja;

import java.util.Arrays;
import java.util.List;

public class SuperSimpleStringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek");
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);
    }
}
