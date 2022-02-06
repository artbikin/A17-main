package hw9am;

public class Job {

    private String industry;
    private String role;
    private int yoe;
    private int salary;

    public Job (String industry, String role, int yoe, int salary){
        this.industry = industry;
        this.role = role;
        this.yoe = yoe;
        this.salary = salary;
    }

    public Job(){}

    public void setIndustry(String industry){
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setYoe(int yoe){
        this.yoe = yoe;
    }

    public int getYoe() {
        return yoe;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void hello(String name){
        System.out.println("Hello, my name is "+name+". I am a "+role+" in the "+industry+" industry with "+yoe+" years of experience. I make $"+salary+" per year.");
    }


}
