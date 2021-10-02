package rekurencja.zad2Sklepowy_kosz;

public class Cart {
    static final int NUMBER_OF_PRODUCTS = 10;
    Product[] products = new Product[NUMBER_OF_PRODUCTS];
    private int productCounts;

    void addProduct(Product product){
        if(productCounts<NUMBER_OF_PRODUCTS){
            products[productCounts] = product;
            productCounts ++;
        }
    }
    double totalCosts(){
        return sumePrice(0);
    }

    private double sumePrice(int counter) {
        if(counter < (productCounts-1)){
            return products[counter].getPrice() + sumePrice(++counter);
        }else {
            return products[counter].getPrice();
        }

    }
}
