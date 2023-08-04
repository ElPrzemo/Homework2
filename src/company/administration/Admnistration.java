package company.administration;

import company.person.Customer;

import java.util.HashMap;
import java.util.Map;

public class Admnistration {

    private Map<Integer, Customer> customers;

    public Admnistration() {
        this.customers = new HashMap<>();
    }

    public void addCustomer(int customerId, Customer customer) {
        customers.put(customerId, customer);
    }

    public void updateCustomerProfile(int customerId, String name, String surname, String address, String email) {
        Customer customer = customers.get(customerId);
        if (customer != null) {
            customer.setName(name);
            customer.setSurname(surname);
            customer.setAddress(address);
            customer.setEmailAdress(email);
        } else {
            System.out.println("Customer with ID " + customerId + " does not exist.");
        }
    }
}







