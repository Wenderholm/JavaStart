package metody_konstruktory.zadanie2;

public class Offer {
    Product product;
    double price;
    boolean special;

    public Offer(Product product, double price, boolean special) {
        this.product = product;
        this.price = price;
        this.special = special;
    }

    public void getInfo(){
        System.out.println(product.name + product.producer + ", " + price + "zł, oferta specjalna?" + special );
    }
}
