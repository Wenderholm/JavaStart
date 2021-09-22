package metody_konstruktory.zadanie2;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("czekolada mleczna", "milka");
        Offer offer1 = new Offer(product1, 10.20, true);
        offer1.getInfo();
    }
}
