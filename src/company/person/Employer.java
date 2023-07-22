package company.person;

import company.person.EmployerType;
import company.person.Person;

public class Employer extends Person {
    private EmployerType type;
    private int salary;

    public Employer(String name, String surname, String address, EmployerType type, int salary) {
        super(name, surname, address);
        this.type = type;
        this.salary = salary;
    }

    public EmployerType getType() {
        return type;
    }

    public void setType(EmployerType type) {
        this.type = type;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "type=" + type +
                ", salary=" + salary +
                "} " + super.toString();
    }

    public void giveRise(double percentage){
        this.salary= (int) (salary *percentage);


    }
}

