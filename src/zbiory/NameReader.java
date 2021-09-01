package zbiory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameReader {
    public static void main(String[] args) {
        final String fileName = "namespl.txt";

        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -(o1.compareTo(o2));
            }
        });
        try {
            Scanner sc = new Scanner(new File("namespl.txt"));
            while(sc.hasNextLine()){
                names.add(sc.nextLine());
            }
            System.out.println("ilość unikalnych imion: " + names.size());
            System.out.println("First name: " + names.first());
            System.out.println("Last name: " + names.last());
        } catch (FileNotFoundException e) {
            System.err.println("brak pliku " + fileName);
        }
    }
}
