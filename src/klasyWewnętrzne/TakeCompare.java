package klasyWewnętrzne;

public class TakeCompare {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort() {
            @Override
            public void bubbleSort(int[] tab) {
                if(tab == null)
                    throw new NullPointerException("argument cannot be null");
                if(tab.length == 0)
                    throw new IllegalArgumentException("tablica musi miec jakąs warotśc");

                for (int i = 0; i < tab.length; i++) {
                    for (int j = 1; j < tab.length - i; j++) {
                        if (tab[j - 1] > tab[j]) {
                            int temp = tab[j];
                            tab[j] = tab[j - 1];
                            tab[j - 1] = temp;
                        }
                    }
                }
            }
        };
        try{
            int[] tab = {23,5,6,23,19,123,44,32};
            printArray(tab);
            bs.bubbleSort(tab);
            printArray(tab);
        } catch (NullPointerException | IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

    }

    private static void printArray(int[] tab) {
        for (int value:tab){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
