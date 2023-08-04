package company.person;

import java.util.Objects;

public class Customer extends Person {


    private static int customerIdCounter = 1;
    private int customerId;
    private String emailAdress;
    private int transactionNumber = 0;

    public Customer(String name, String surname, String address, String emailAdress) {
        super(name, surname, address);
        this.customerId = customerIdCounter++;
        this.emailAdress = emailAdress;
        this.transactionNumber = transactionNumber;
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

    public String getCustomerDetails() {
        return "Name: " + name + ", Surname: " + surname + ", Address: " + address + ", Email: " + emailAdress;
    }

    @Override
    public String toString() {
        return "Customer{ " +super.toString() +
                "ID=" + customerId +
                "emailAdress='" + emailAdress + '\'' +
                ", transactionsNumber=" + transactionNumber +
                "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }
}
