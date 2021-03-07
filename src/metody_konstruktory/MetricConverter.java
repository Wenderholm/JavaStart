package metody_konstruktory;

public class MetricConverter {
    double meterToCm(double meters){
        return meters*100;
    }

    double meterToMm(double meters){
        return meters*1000;
    }
    double cmToMeter(double centymetr){
        return centymetr/100;
    }
    double mmToMeter(double milimetr){
        return milimetr/1000;
    }
}
