package wyrazeniaLambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> randomNumber = new ArrayList<>();
        generate(randomNumber,10, ()->r.nextInt(1000));
        consume(randomNumber, x -> System.out.print(x + " "));
        System.out.println();
        filerList(randomNumber, x -> x % 2 == 0);
        consume(randomNumber, x -> System.out.print(x + " "));
//        filerList(randomNumber, x -> x > 200);
//        consume(randomNumber, x -> System.out.print(x + " "));


    }

    private static <T> void generate(List<T> list, int toGenerate, Supplier<T> sup){
        for (int i = 0; i < toGenerate ; i++) {
            list.add(sup.get());
        }
    }
    private static <T> void consume(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }
    private static <T> void filerList(List<T> list, Predicate<T> pred){
        Iterator<T> it = list.iterator();
        while(it.hasNext()){
            T temp = it.next();
            if(pred.test(temp)){
                it.remove();
            }
        }
    }

}
