package rekurencja.zad2Sklepowy_kosz;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("mleko", 1));
        cart.addProduct(new Product("czekolada", 2));
        cart.addProduct(new Product("jogurt", 3));

        double cartCost = cart.totalCosts();
        System.out.println("Koszt koszyka: " + cartCost + "zł");
    }
}
