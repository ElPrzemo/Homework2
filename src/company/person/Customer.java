package company;

public class Customer extends Person {
    private  String emailAdress;
    private int transactionsNumber;

    public Customer(String name, String surname, String address, String emailAdress, int transactionsNumber) {
        super(name, surname, address);
        this.emailAdress = emailAdress;
        this.transactionsNumber = transactionsNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public int getTransactionsNumber() {
        return transactionsNumber;
    }

    public void setTransactionsNumber(int transactionsNumber) {
        this.transactionsNumber = transactionsNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "emailAdress='" + emailAdress + '\'' +
                ", transactionsNumber=" + transactionsNumber +
                "} " + super.toString();
    }
}
