package enumTraining.zad2sklep_internetowy;

public enum OrderStatus {
    NEW("Nowe"),
    PAID("Opłacone"),
    SHIPPED("Wysłane"),
    DELIVERED("Dostarczone"),
    CANCELLED("Anulowane");

    private final String descrption;

    OrderStatus(String descrption) {
        this.descrption = descrption;
    }

    @Override
    public String toString() {
        return descrption;
    }
}
