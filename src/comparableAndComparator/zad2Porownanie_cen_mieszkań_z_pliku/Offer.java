package comparableAndComparator.zad2Porownanie_cen_mieszkań_z_pliku;

public class Offer implements Comparable<Offer>{
    private String city;
    private double price;
    private double area;

    public Offer(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    double getPricePerSqr(){
        return price/area;
    }

    @Override
    public int compareTo(Offer o) {
        return Double.compare(getPricePerSqr(),o.getPricePerSqr());
    }

    @Override
    public String toString() {
        return city + ", " + price + "zł, " + area + "mkw, "
                + String.format("%.2f", getPricePerSqr()) + "zł/mkw";
    }
}
