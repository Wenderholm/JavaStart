package listy;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest<privat> {
    public static final String EXIT = "exit";
    private static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        listDetails(numbers);
    }

    private static void fillList(List<Double> list){
        System.out.println("podaj kolejną liczbę lub wpisz exit");
        String input = sc.nextLine();
        if (input.equals(ListTest.EXIT)){
            return;
        }
        try {
            Double num = Double.valueOf(input);
            list.add(num);
        } catch(NumberFormatException e){
            System.err.println("musisz podać liczbę lub wpisac exit");
        }
        fillList(list);
    }

    static void listDetails(List<Double> list) {
        if(!list.isEmpty()){
            StringBuilder sb = new StringBuilder();
            double sum = 0;
//            dodawanie znaków do siebie za pomoca StringBuildera
            for (Double d : list) {
                sb.append(d);
                sb.append(" + ");
                sum += d;
            }
            sb.replace(sb.length()-1,sb.length()," = ");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }
}
