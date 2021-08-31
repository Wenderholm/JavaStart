package comparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class NumberComparator {
    private static final int INITIAL_CAPACITY= 5;
    public static void main(String[] args) {

        System.out.println("----przykład własny z dodaniem random numbers----");
        Integer[] tablicaLosowa = new Integer[INITIAL_CAPACITY];
        Random generator = new Random();

//       tworzenie losowych liczb w tablicy
        for (int i = 0; i < tablicaLosowa.length ; i++) {
            tablicaLosowa[i] = generator.nextInt();
        }
//        wyswietlanie tablicy
//        for (int i = 0; i < tablicaLosowa.length; i++) {
//            System.out.println(tablicaLosowa[i] + " ");
//        }
        System.out.println("niesortowana: ");
        System.out.println(Arrays.toString(tablicaLosowa));

        System.out.println("sortowana: ");
        Arrays.sort(tablicaLosowa);
        System.out.println(Arrays.toString(tablicaLosowa));

        Arrays.sort(tablicaLosowa, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });
        System.out.println("sortowana malejąco: ");
        System.out.println(Arrays.toString(tablicaLosowa));

        System.out.println("------------------------------------------------");
        System.out.println("----przykład z kursu----");

        Integer[] numbers = { 1, 5, 10, 19, 102, 43, 25, 36, 31, 99,
                9, 77, 7, 66, 6, 55, 44, 33, 1098, 1111 };

        System.out.println("nieposortowane liczby:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("posortowane liczby:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });
        System.out.println("posortowane malejąco: ");
        System.out.println(Arrays.toString(numbers));
    }
}


