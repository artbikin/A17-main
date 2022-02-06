package hw10am;

public class Job {
    protected String position;
    protected int yoe;
    protected int salary;
    protected String company;

    public void describe(){
        System.out.println("This "+position+" job at "+company+" pays "+salary+" and requires "+yoe+" years of experience.");
    }

    public Job(String position, int yoe, int salary, String company) {
        this.position = position;
        this.yoe = yoe;
        this.salary = salary;
        this.company = company;
    }

    public Job(){}

    public void setPosition(String position) {
        this.position = position;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public int getYoe() {
        return yoe;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }
}
