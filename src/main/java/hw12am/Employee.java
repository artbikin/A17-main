package hw12am;

public class Employee implements JobSearch{
    private String role;
    private String company;

    public Employee(String role, String company) {
        this.role = role;
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void salary(int salary) {
        System.out.println("A " + role + " at " + company + " is currently making " + salary);
    }

    @Override
    public void openForOpportunities(Boolean open) {
        if (open){
            System.out.println("A " + role + " at " + company + " is currently open for new job opportunities.");
        } else {
            System.out.println("A " + role + " at " + company + " is not currently open for new job opportunities.");
        }
    }
}
