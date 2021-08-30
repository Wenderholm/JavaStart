package typyGeneryczne;

public class TestPair {
    public static void main(String[] args) {
        Pair <String, Integer> p1 = new Pair("ania", 1988);
        Pair <Double, Integer> p2 = new Pair(20.5, 1988);
        Pair <String, Double> p3 = new Pair("ania", 11.1);

        printPair(p1);
        printPair(p2);
        printPair(p3);

    }

    public static <T,V> void printPair(Pair<V,T> pair){
        System.out.println("Para liczb to: <" + pair.getV() + ", " + pair.getT() + ">");
    }
}
