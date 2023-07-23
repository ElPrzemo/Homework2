package company.service;

import company.person.Customer;
import company.products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class OrderService {
    private List<Order> inventory;
    private Map<String, Customer> customers;

    public OrderService(Map<String, Customer> customers) {
        this.inventory = new ArrayList<>();
        this.customers = customers;
    }



    public OrderService() {
        this.inventory = new ArrayList<>();
    }

    public void addOrder(Order order) {
        inventory.add(order);
    }

    public void deleteOrder(String orderId) {
        inventory.removeIf(order -> Integer.toString(order.getOrderId()).equals(orderId));
    }
    public List<Order> displayOrders() {
        for (Order order : inventory) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Customer: " + order.getCustomer().getName() + " " + order.getCustomer().getSurname());
            System.out.println("Total Cost: " + order.getTotalCost());
            System.out.println("Products:");
            for (Product product : order.getProducts()) {
                System.out.println("- " + product.getName() + " (" + product.getPrice() + ")");
            }
            System.out.println();
        }
        return inventory;
    }


    public void updateCustomerProfile(int customerId, String name, String surname, String address, String email) {
        for (Order order : inventory) {
            if (order.getCustomer().getCustomerId() == customerId) {
                order.getCustomer().setName(name);
                order.getCustomer().setSurname(surname);
                order.getCustomer().setAddress(address);
                order.getCustomer().setEmailAdress(email);
                return;
            }
        }
        System.out.println("Customer with ID " + customerId + " does not exist.");
    }
}