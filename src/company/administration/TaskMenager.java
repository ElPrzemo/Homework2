package company.administration;

import company.person.Employer;



public class TaskMenager {

    EmployerService employerService = new EmployerService();

    public void giveSomethingToDo(Employer employer) {
        switch (employer.getEmployerType()) {
            case WAREHOUSMAN:
                employerService.sendAllOrders(employer);
                break;
            case INFORMATICS:
                employerService.makeUpdateOfSystems(employer);
                break;
            case MENAGER:
                employerService.giveRiseByBossDecision(employer, 1.1);
                break;
            case SALESMAN:
                employerService.giveRiseByMotivationSystem(employer, employer.getPreparedOrders());
            default:
                break;
        }

    }}
