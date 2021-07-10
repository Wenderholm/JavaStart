package dziedziczenie.shop_super;

public class Apple extends Fruit{
    public static final String TYPE = "jablkowaty";
    private String variety;

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Apple(double weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    @Override
    String getInfo() {
        return super.getInfo() + " ,odmiana: " + variety;
    }
}
