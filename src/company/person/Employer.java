package company.person;



public class Employer extends Person {

    private int salary;

    private int preparedOrders = 0;

    public Employer(String name, String surname, String address, int salary) {
        super(name, surname, address);
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employer{" +super.toString() +
                ", salary=" + salary +
                "} ";
    }

    public  int getPreparedOrders() {
        return preparedOrders;
    }

    public  void increseNumberOfPreparedOrders() {
        preparedOrders++;
    }

    public void giveRiseByBossDecision(double percentage){
        this.salary= (int) (salary *percentage);
    }

    public void giveRiseByMotivationSystem(int preparedOrders){
        if(preparedOrders>3){
            this.salary= salary *= 1.2;
        } else if (preparedOrders>6) {
            this.salary=salary *=1.4;
        }else if (preparedOrders>9){
            this.salary=salary *=1.6;
        } else {
            System.out.println("You should work more!");
        }
    }
}

