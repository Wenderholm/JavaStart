package metody_konstruktory.calculate;

public class MetricTest {
    public static void main(String[] args) {
        MetricConverter converter = new MetricConverter();
        double m = 2;
        double mToCm = converter.meterToCm(m);
        double mToMm = converter.meterToMm(m);
        System.out.println("tyle metrów: "+ m + " to centymetrów: "+ mToCm);
        System.out.println("tyle metrów: "+ m + " to milimetrów: "+ mToMm);
    }

}