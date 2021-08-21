package equalComputerShop;

public class DataStore {
    private final int maxComputerNumber = 100;
    private Computer[] computers = new Computer[maxComputerNumber];
    private int computersNumber;

    public void add(Computer computer){
        if(computersNumber < maxComputerNumber && computer != null){
            computers[computersNumber] = computer;
            computersNumber++;
        } else {
            System.out.println("Magazyn jest za mały aby dodać więcej produktów");
        }
    }
    int checkAvailability(Computer find) {
        if (find == null)
            return 0;

        int count = 0;
        for (int i = 0; i < computersNumber; i++) {
            if (find.equals(computers[i]))
                count++;
        }
        return count;
    }
// tworzenie tablicy bez nulli
    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }
}
