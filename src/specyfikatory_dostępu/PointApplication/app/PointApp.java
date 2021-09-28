package specyfikatory_dostępu.PointApplication.app;

import specyfikatory_dostępu.PointApplication.controller.PointController;
import specyfikatory_dostępu.PointApplication.data.Point;

import java.util.Scanner;

public class PointApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Point p1 = new Point(5,7);
        PointController cont1 = new PointController();



        System.out.println("punkt początkowy to: (" + p1.getX()+ "; "+p1.getY()+")");
//        cont1.addX(p1);
//        System.out.println("punkt po uzyciu addX (" + p1.getX()+ "; "+p1.getY()+")");
//        cont1.addY(p1);
//        System.out.println("punkt po uzyciu addY (" + p1.getX()+ "; "+p1.getY()+")");
//        cont1.minusX(p1);
//        System.out.println("punkt po uzyciu minusX (" + p1.getX()+ "; "+p1.getY()+")");
//        cont1.minusY(p1);
//        System.out.println("punkt po uzyciu minusY (" + p1.getX()+ "; "+p1.getY()+")");


        System.out.println("1 - przesunięcie punktu w osi X w prawo");
        System.out.println("2 - przesunięcie punktu w osi X w lewo");
        System.out.println("3 - przesunięcie punktu w osi Y w górę");
        System.out.println("4 - przesunięcie punktu w osi Y w dół");
        System.out.println("wybierz jedną z opcji ");

        int option = scan.nextInt();
        System.out.println("wybrana opcja to: "+ option);
        switch (option){
            case 1:
                cont1.addX(p1);
                break;
            case 2:
                cont1.addY(p1);
                break;
            case 3:
                cont1.minusX(p1);
                break;
            case 4:
                cont1.minusY(p1);
                break;
            default:
                System.out.println("zła opcja ");
        }
        System.out.println("punkt to: (" + p1.getX()+ "; "+p1.getY()+")");
    }
}
