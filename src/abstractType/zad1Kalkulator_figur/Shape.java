package abstractType.zad1Kalkulator_figur;

interface Shape {
    int RECTANGLE = 1;
    int CIRCLE = 2;
    int TRIANGLE = 3;

    public static final double PI = 3.14;
    double calculateArea();
    double calculatePerimeter();

}
