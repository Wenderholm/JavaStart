package typOpakowujacy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        final String fileName = "numbers.txt";
        try(
                var fr = new FileReader(fileName);
                var br = new BufferedReader(fr);
                ){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            BigInteger big1 = new BigInteger(br.readLine());
            BigInteger big2 = new BigInteger(br.readLine());
            System.out.println("wynik pierwszych trzech cyfr to: " + (a + b + c));
            System.out.println("wynik big cyfr to: " + big1.add(big2));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } {

        }
    }
}
