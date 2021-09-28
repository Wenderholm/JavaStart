package specyfikatory_dostępu.zad4liczby;

public class NumberInformation {
    public void howBigIs(int num, int compareTo){
        if(num > compareTo){
            System.out.println("liczba większa niż 5000");
        }else if(num <compareTo){
            System.out.println("liczba mniejsza niż 5000");
        }else{
            System.out.println("licza równa 5000");
        }
    }
    public void oddOrEven(int num){
        if(num%2==0){
            System.out.println("liczba "+ num + " jest parzysta");
        } else{
            System.out.println("liczba "+ num + " jest nieparzrysta");
        }
    }
    public int addZero(int num){
        if(num ==0)
            return 0;
        if (num/1000 != 0)
            return num;
        else if(num/100 !=0)
            return num * 10;
        else if (num / 10 != 0)
            return num *100;
        else
            return num*1000;
    }

}
