package rekurencja;

public class Silnia {
    public static void main(String[] args) {
        int number = 5;
        int suma = silnia(number);
        System.out.println("silnia wynosi z " + number + " wynosi: " + suma);


    }
//    WERSJA ROZWINIĘTA
//    static int silnia(int n){
//        if (n > 1){
//            return n * silnia(n-1);
//        }else{
//            return 1;
//        }
//    }

//    WERSJA TRÓJARGUMENT
    static int silnia(int n){
        return (n > 1) ? n * silnia(n-1) : 1;
    }
}
