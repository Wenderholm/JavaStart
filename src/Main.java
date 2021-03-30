public class Main {
    public static void main(String[] args) {

                int number = 0;

                while(number < 10) {
                    if(number % 2 == 0) {
                        number++;
                        continue;
                    } else if (number % 5 == 0) {
                        break;
                    }
                    System.out.print(number+" ");
                    number++;
                }
            }
        }

