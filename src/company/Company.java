package company;

import company.person.Customer;
import company.person.Employer;
import company.products.PRODUCT_TYPE;
import company.products.Product;
import company.service.Order;
import company.service.OrderService;

import java.util.HashMap;
import java.util.Map;

public class Company {

    public static void main(String[] args) {

        Employer employer = new Employer("Franek", "Brzęczyszczykiewicz", "Warszawa", 4500);
        Customer customer = new Customer("Przemek", "Włodarczyk", "Otwock", "mail@gmail.com");


        Map<String, Customer> customers = new HashMap<>();
        customers.put(Integer.toString(customer.getCustomerId()), customer);

        OrderService orderService = new OrderService(customers);

        Order order1 = new Order(customer, employer);
        order1.addProduct(new Product("Potato", 5, PRODUCT_TYPE.FOOD));
        order1.addProduct(new Product("Potato", 7, PRODUCT_TYPE.FOOD));
        order1.addProduct(new Product("Tomato", 8, PRODUCT_TYPE.FOOD));
        order1.addProduct(new Product("Batato", 9, PRODUCT_TYPE.FOOD));
        order1.addProduct(new Product("Soap", 4, PRODUCT_TYPE.COSMETICS));
        order1.addProduct(new Product("T-Shirt", 40, PRODUCT_TYPE.CLOTHES));

        orderService.addOrder(order1);

        System.out.println("Total cost: " + order1.getTotalCost());
        System.out.println(order1.getCustomer());
        System.out.println(customer.getTransactionNumber());

        Order order2 = new Order(customer, employer);
        order2.addProduct(new Product("Potatos", 8, PRODUCT_TYPE.FOOD));
        order2.addProduct(new Product("Soap", 4, PRODUCT_TYPE.COSMETICS));
        order2.addProduct(new Product("T-Shirt", 40, PRODUCT_TYPE.CLOTHES));

        orderService.addOrder(order2);

        System.out.println(customer.getTransactionNumber());

        System.out.println("All orders:");
        orderService.displayOrders();

        Order order3 = new Order(customer, employer);
        order3.addProduct(new Product("Trousers", 47, PRODUCT_TYPE.CLOTHES));

        Order order4 = new Order(customer, employer);
        order4.addProduct(new Product("Blouse", 452, PRODUCT_TYPE.CLOTHES));

        System.out.println("Employer Franek prepared: " + employer.getPreparedOrders() + " orders");

        System.out.println("Obecna wypłata pracownika to:" + employer.getSalary());

        employer.giveRiseByMotivationSystem(employer.getPreparedOrders());

        System.out.println();

        System.out.println("Wypłata po podwyżce pracownika to:" + employer.getSalary());



       orderService.updateCustomerProfile(Integer.parseInt(String.valueOf(1
       )), "Janusz", "Moczywąs", "Wąchock", "moczywas@mail.com");
       System.out.println(customer.toString());

       orderService.deleteOrder(order1.toString());
    }






}