package company;

import company.administration.Admnistration;
import company.administration.TaskMenager;
import company.person.Employer;
import company.person.EmployerType;


public class Company {

    public static void main(String[] args) {

       Employer employer = new Employer("Franek", "Brzęczyszczykiewicz", "Warszawa", 4500, 0, 4, EmployerType.WAREHOUSMAN);
       Employer employer2 = new Employer("Jakub", "Wędrowycz", "Wojsławice", 6000, 0, 10, EmployerType.MENAGER);
       Employer employer3 = new Employer("Michał", "Anioł", "Siedlce", 8500, 0, 2, EmployerType.INFORMATICS);
       Employer employer4 = new Employer("Zygmunt", "Kolumn", "Praga", 5200, 4, 1, EmployerType.SALESMAN);

        Admnistration admin = new Admnistration();
        TaskMenager taskMenager = new TaskMenager();



        taskMenager.giveSomethingToDo(employer);
        taskMenager.giveSomethingToDo(employer2);
        taskMenager.giveSomethingToDo(employer3);
        taskMenager.giveSomethingToDo(employer4);








//
//        Customer customer = new Customer("Przemek", "Włodarczyk", "Otwock", "mail@gmail.com");
//
//        System.out.println(customer.getCustomerDetails());
//
//        Map<String, Customer> customers = new HashMap<>();
//        customers.put(Integer.toString(customer.getCustomerId()), customer);
//
//        OrderService orderService = new OrderService(customers);
//
//        List<Order> inventory = new ArrayList<>(); //
//
//
//        admin.addCustomer(customer.getCustomerId(), customer);
//
//
//        admin.updateCustomerProfile(1, "Janusz", "Moczywąs", "Wąchock", "moczywas@mail.com");
//
//
//        System.out.println(customer.toString());


    }
}