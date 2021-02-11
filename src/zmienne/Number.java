package zmienne;

import java.util.Random;

public class Number {
    public static void main(String[] args) {
        Random r = new Random();

        int x = r.nextInt(100);
        int y = r.nextInt(100);
//        int x = 1;
//        int y = 3;
        System.out.println("liczba x to: " + x);
        System.out.println("liczba y to: " + y);
//        Czy x jest większe od y?
        System.out.println("x > y : " + (x>y));
//        Czy x pomnożone przez 2 jest większe od y?
        System.out.println("2 * x > y : " + (2*x>y));
//        Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
        System.out.println(" (y < x+3) && ( y > x + 2) : " + (y<x+3 && y>x-2));
//        Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)
        System.out.println("czy x * y jest parzyste : " + ((x*y)%2==0));

    }
}
