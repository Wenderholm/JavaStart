package loops.taskTwo_hospital;

public class Hospital {
    private final int maxPatientsNumber = 3;
    private Patient[] patients = new Patient[maxPatientsNumber];
    private int regPatient;

    public void addPatient(Patient patient) {
        if (regPatient < maxPatientsNumber) {
            patients[regPatient] = patient;
            regPatient++;
        } else {
            System.out.println("Zapisano maxymalną liczbę pacjentów, zapraszamy jutro!");
        }
    }

    public void printPatients(){
        for (int i=0; i<regPatient; i++){
            System.out.println(patients[i].getFirstName()+ " " + patients[i].getLastName()+ " " + patients[i].getPesel());
        }
    }

}
