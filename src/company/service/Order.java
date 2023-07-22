package company.service;

import company.person.Customer;
import company.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderIdCounter = 1;
    private int orderId;
    private Customer customer;
    private List<Product> products;
    private double totalCost;

    public Order(Customer customer) {
        this.orderId = orderIdCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalCost = 0.0;
        customer.incrementTransactionNumber();
    }

    public Order(int orderId, Customer customer, List<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.totalCost = calculateTotalCost();
        customer.incrementTransactionNumber();
    }

    public Order(String orderId, List<String> products) {

    }


    private double calculateTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
        this.totalCost = calculateTotalCost();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalCost += product.getPrice();
    }

    public int getProductQuantity() {
        return products.size();
    }


}