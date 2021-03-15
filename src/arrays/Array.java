package arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers1 = {3,5,31};
        int[] numbers2 = {2,21,12};

        SumMetod arraySum = new SumMetod();
        int sumArray = arraySum.summa(numbers1, numbers2);
        System.out.println(sumArray);


        int sum = numbers1[0] + numbers1[1] +numbers1[2] + numbers2[0] + numbers2[1] + numbers2[2];
        System.out.println(sum);
    }
}
