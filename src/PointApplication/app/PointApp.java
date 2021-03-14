package PointApplication.app;

import PointApplication.controller.PointController;
import PointApplication.data.Point;

public class PointApp {
    public static void main(String[] args) {
        Point p1 = new Point(5,7);
        PointController cont1 = new PointController();

        System.out.println("punkt początkowy to: (" + p1.getX()+ "; "+p1.getY()+")");
        cont1.addX(p1);
        System.out.println("punkt po uzyciu addX (" + p1.getX()+ "; "+p1.getY()+")");
        cont1.addY(p1);
        System.out.println("punkt po uzyciu addY (" + p1.getX()+ "; "+p1.getY()+")");
        cont1.minusX(p1);
        System.out.println("punkt po uzyciu minusX (" + p1.getX()+ "; "+p1.getY()+")");
        cont1.minusY(p1);
        System.out.println("punkt po uzyciu minusY (" + p1.getX()+ "; "+p1.getY()+")");
    }
}
