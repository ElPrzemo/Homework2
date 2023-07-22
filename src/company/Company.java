package company;

import company.person.Customer;
import company.products.PRODUCT_TYPE;
import company.products.Product;
import company.service.Order;
import company.service.OrderService;

public class Company {

    public static void main(String[] args) {

        Customer customer = new Customer("Przemek", "Włodarczyk", "Otwock", "mail@gmail.com");

        OrderService orderService = new OrderService();

        Order order1 = new Order(customer);
        order1.addProduct(new Product("Potato", 5, PRODUCT_TYPE.FOOD));
        order1.addProduct(new Product("Potato", 7, PRODUCT_TYPE.FOOD));
        order1.addProduct(new Product("Tomato", 8, PRODUCT_TYPE.FOOD));
        order1.addProduct(new Product("Batato", 9, PRODUCT_TYPE.FOOD));
        order1.addProduct(new Product("Soap", 4, PRODUCT_TYPE.COSMETICS));
        order1.addProduct(new Product("T-Shirt", 40, PRODUCT_TYPE.CLOTHES));

        orderService.addOrder(order1); // Dodajemy zamówienie do usługi OrderService

        System.out.println("Total cost: " + order1.getTotalCost());
        System.out.println(order1.getCustomer());
        System.out.println(customer.getTransactionNumber());

        Order order2 = new Order(customer);
        order2.addProduct(new Product("Potatos", 8, PRODUCT_TYPE.FOOD));
        order2.addProduct(new Product("Soap", 4, PRODUCT_TYPE.COSMETICS));
        order2.addProduct(new Product("T-Shirt", 40, PRODUCT_TYPE.CLOTHES));

        orderService.addOrder(order2); // Dodajemy kolejne zamówienie do usługi OrderService

        System.out.println(customer.getTransactionNumber());

        System.out.println("All orders:");
        orderService.displayOrders(); // Wyświetlamy wszystkie zamówienia
    }
}