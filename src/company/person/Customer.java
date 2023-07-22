package company.person;

public class Customer extends Person {

    private  String emailAdress;

    private  int transactionNumber =0;

    public Customer(String name, String surname, String address, String emailAdress) {
        super(name, surname, address);
        this.emailAdress = emailAdress;
        this.transactionNumber = transactionNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
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
                "emailAdress='" + emailAdress + '\'' +
                ", transactionsNumber=" + transactionNumber +
                "}";
    }

//    public void updateCustomerProfile(String name, String surname, String address, String email) {
//        setName(name);
//        setSurname(surname);
//        setAddress(address);
//        setEmailAdress(email);
//    }

}
