package company;

import company.administration.Admnistration;
import company.person.Customer;
import company.person.Employer;
import company.service.Order;
import company.service.OrderService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

    public static void main(String[] args) {

        Employer employer = new Employer("Franek", "Brzęczyszczykiewicz", "Warszawa", 4500);
        Customer customer = new Customer("Przemek", "Włodarczyk", "Otwock", "mail@gmail.com");

        System.out.println(customer.getCustomerDetails());

        Map<String, Customer> customers = new HashMap<>();
        customers.put(Integer.toString(customer.getCustomerId()), customer);

        OrderService orderService = new OrderService(customers);

        List<Order> inventory = new ArrayList<>(); // Przykładowa lista zamówień
        Admnistration admin = new Admnistration();


        admin.addCustomer(customer.getCustomerId(), customer);


        admin.updateCustomerProfile(1, "Janusz", "Moczywąs", "Wąchock", "moczywas@mail.com");


        System.out.println(customer.toString());


    }
}