package company.service;

import company.products.Product;

import java.util.ArrayList;
import java.util.List;






public class OrderService {
    private List<Order> inventory;

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
}