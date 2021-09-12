package referencja.refDoMetody;

public class Computer {
    private String name;
    private int cpu;
    private int temperature;

    public Computer(String name, int cpu, int temperature) {
        this.name = name;
        this.cpu = cpu;
        this.temperature = temperature;
    }

    void overclock(){
//        int mnożymy z double
//        poniższy zapis to jest to samo co:
//        cpu= (int)(cpu * 1.1); - wartość zostaje rzutwana
        cpu *= 1.1;
        temperature *= 1.1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
