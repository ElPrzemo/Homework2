package company.administration;

import company.person.Employer;



public class EmployerService {

    protected void giveRiseByBossDecision(Employer employer, Double riseValue) {
        double salary = employer.getSalary();
        salary *= riseValue;
        employer.setSalary(salary);
        System.out.println("Boss apreciate what you doing for company and gives you 10% raise of salary.");
    }

    protected void sendAllOrders(Employer employer) {
        System.out.println("All waiting orders were prepared. Packages waiting for the courier to arrive.");
    }

    protected void makeUpdateOfSystems(Employer employer) {
        System.out.println("All updates of all IT systems were made.");
    }


    protected void giveRiseByMotivationSystem(Employer employer, int ordersSold) {
        double employerSalary = employer.getSalary();
        if (ordersSold > 3) {
            employerSalary *= 1.2;
            System.out.println("Good job! We increase you salary for 20%.");
        } else if (ordersSold > 6) {
            employerSalary  *= 1.4;
            System.out.println("Good job!  We increase you salary for 40%.");
        } else if (ordersSold > 9) {
            employerSalary *= 1.6;;
            System.out.println("Good job!  We increase you salary for 20%.");
        } else {
            System.out.println("You should work more!");
        }


    }
}







