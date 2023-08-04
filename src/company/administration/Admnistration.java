package company.administration;

import company.person.Customer;
import company.person.Employer;
import company.person.EmployerType;

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

    public void quartierRaise (Employer employer){
        double quartier = 0.25;
        double experience = employer.getYearsOfWork();
        double iterationCounter = experience / quartier;
        double basicSalary =  employer.getSalary();

        for (int j = 0; j <iterationCounter; j ++){

            basicSalary *=1.02;
            employer.setSalary(basicSalary);
        }
    }

    public static Employer hireEmployer(String name, String surname, String address, double salary, int ordersSold, double yearsOfWork, EmployerType employerType){
        return new Employer(name, surname, address, salary, ordersSold, yearsOfWork, employerType);
    }
}







