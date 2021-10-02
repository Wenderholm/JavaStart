package arraysTraining.zad2porownanie_tablic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszy wyraz");
        String text1 = scanner.nextLine();
        System.out.println("podaj drugi wyraz");
        String text2 = scanner.nextLine();
        boolean compareResult = compareLetters(text1, text2);
        if (compareResult) {
            System.out.println("Napisy składają się z tych samych liter");
        } else {
            System.out.println("Napisy składają się z różnych liter");
        }    }

    private static boolean compareLetters(String s1, String s2) {
        if (s1 == null && s2 == null)
            return true;
        if (s1 == null || s2 == null || s1.length() != s2.length())
            return false;
        char[] chars1 = s1.toLowerCase().toCharArray();
        char[] chars2 = s2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
