package enumTraining.zad2sklep_internetowy;

public class Order {
    private String item;
    private double prices;
    private OrderStatus status;

    public Order(String item, double prices, OrderStatus status) {
        this.item = item;
        this.prices = prices;
        this.status = status;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return item + " ("+ prices + "zł) "+ status;
    }
}
