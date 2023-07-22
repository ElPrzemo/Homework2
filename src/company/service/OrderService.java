package company.service;

import company.person.Customer;
import company.products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class OrderService {
    private List<Order> inventory;
    private Map<String, Customer> customers;

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

    public void updateCustomerProfile(String customerId, String name, String surname, String address, String email) {
        if (customers.containsKey(customerId)) {
            Customer customer = customers.get(customerId);
            customer.setName(name);
            customer.setSurname(surname);
            customer.setAddress(address);
            customer.setEmailAdress(email);
        } else {
            System.out.println("Customer with ID " + customerId + " does not exist.");
        }
    }
}