package scannerTask;

public class ScanCalcu {
    double add(double x, double y){
        return x + y;
    }
    double add(double x, double y, double z){
        return add(x,y) + z;
    }
    double substract(double x, double y){
        return x - y;
    }
    double substract(double x, double y, double z){
        return substract(x,y) - z;
    }
    double multiply(double x, double y){
        return x * y;
    }
    double divide(double x, double y){
        return x / y;
    }
}
