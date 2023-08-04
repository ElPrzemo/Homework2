package company.person;

public class Employer extends Person {

    private double salary;

    private int ordersSold = 0;

    private double yearsOfWork;


    private EmployerType employerType;

    public Employer(String name, String surname, String address, double salary, int ordersSold, double yearsOfWork, EmployerType employerType) {
        super(name, surname, address);
        this.salary = salary;
        this.ordersSold = ordersSold;
        this.yearsOfWork = yearsOfWork;
        this.employerType = employerType;
    }


    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    public EmployerType getEmployerType() {
        return employerType;
    }

    public double getYearsOfWork() {
        return yearsOfWork;
    }

    public int getPreparedOrders() {
        return ordersSold;
    }

    public void increseNumberOfPreparedOrders() {
        ordersSold++;
    }


    @Override
    public String toString() {
        return "Employer{" +
                "salary=" + salary +
                ", ordersSold=" + ordersSold +
                ", yearsOfWork=" + yearsOfWork +
                ", employerType=" + employerType +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}

