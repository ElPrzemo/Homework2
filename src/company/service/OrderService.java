package company.service;

import java.util.List;
import java.util.Map;

public class OrderService {
    private final Map<String, Integer> inventory;

    public OrderService(Map<String, Integer> inventory) {
        this.inventory = inventory;
    }

    public void addOrder(String orderId, List<String> products) {
        Order newOrder = new Order(orderId, products);
        inventory.put(orderId, newOrder.getProductQuantity());
    }
}