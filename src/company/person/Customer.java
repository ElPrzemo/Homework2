package company.person;

public class Customer extends Person {


    private static int customerIdCounter = 1;
    private int customerId;
    private  String emailAdress;

    private  int transactionNumber =0;

    public Customer(String name, String surname, String address, String emailAdress) {
        super(name, surname, address);
        this.emailAdress = emailAdress;
        this.customerId=customerIdCounter;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public  int getTransactionNumber() {
        return transactionNumber;
    }

    public  void incrementTransactionNumber() {
        transactionNumber++;
    }

    @Override
    public String toString() {
        return "Customer{ " +super.toString() +
                "ID=" + customerId +
                "emailAdress='" + emailAdress + '\'' +
                ", transactionsNumber=" + transactionNumber +
                "}";
    }
}
