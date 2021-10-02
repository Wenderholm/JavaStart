package abstractType.zad1Kalkulator_figur;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculate {
    private Scanner sc = new Scanner(System.in);

    public void closeScanner() {
        sc.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Podaj informacje o prostokącie.");
        System.out.println("Podaj długość boku A:");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = sc.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleData() {
        System.out.println("Podaj informacje o kole.");
        System.out.println("Podaj długość promienia:");
        double r = sc.nextDouble();

        return new Circle(r);
    }

    private Triangel readTriangleData() {
        System.out.println("Podaj informacje o trójkat.");
        System.out.println("Podaj długość boku A:");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = sc.nextDouble();
        System.out.println("Podaj długość boku C:");
        double c = sc.nextDouble();
        System.out.println("Podaj wysokość:");
        double h = sc.nextDouble();

        return new Triangel(a, b, c, h);
    }

    public Shape createShape() {
        int shapeType = sc.nextInt();
        switch (shapeType) {
            case Shape.RECTANGLE:
                return readRectangleData();
            case Shape.CIRCLE:
                return readCircleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            default:
                throw new NoSuchElementException();
        }
    }

    public void clearBuffer() {
        sc.nextLine();
    }
}
