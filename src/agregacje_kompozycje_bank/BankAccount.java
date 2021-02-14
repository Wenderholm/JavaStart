package agregacje_kompozycje_bank;

public class BankAccount {
    Person owner;
    double balance;

    public BankAccount(Person owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
}
