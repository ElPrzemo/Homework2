package company.person;

public enum EmployerType {

    WAREHOUSMAN("Preparing and packing orders", "Employment contract"),
    INFORMATICS("IT system service","B2B"),
    SALESMAN("Sales new orders", "Employment contract"),
    MENAGER("Cordination of the company's work", "B2B");



    private String responsibilities;
    private String contractType;

    EmployerType(String responsibilities, String contractType) {
        this.responsibilities = responsibilities;
        this.contractType = contractType;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    @Override
    public String toString() {
        return "EmployerType{" +
                "responsibilities='" + responsibilities + '\'' +
                ", contractType='" + contractType + '\'' +
                "} " + super.toString();
    }
}
