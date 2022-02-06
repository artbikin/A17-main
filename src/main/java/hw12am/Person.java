package hw12am;

public class Person implements JobSearch{
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void salary(int salary) {
        System.out.println(name + " " + lastName + " is currently making " + salary);
    }

    @Override
    public void openForOpportunities(Boolean open) {
        if (open){
        System.out.println(name + " " + lastName + " is currently open for new job opportunities.");
    } else {
            System.out.println(name + " " + lastName + " is not currently open for new job opportunities.");
        }
        }
}
