package dziedziczenie.motoShop;

public class MotoShop {
    public static void main(String[] args) {
        Tire tire1 = new Tire(12,"Debica","continetal","205",17,225.0);

        ExhaustPart exhaustPart1 = new ExhaustPart(111,"Brigstone","323", "233", true);

        tire1.printInfo();
        exhaustPart1.printInfo();
    }
}
