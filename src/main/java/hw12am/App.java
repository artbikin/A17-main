package hw12am;

public class App {
    public static void main(String[] args) {
        Person david = new Person("David", "Smith");
        Person sarah = new Person("Sarah", "Miller");

        david.salary(80000);
        david.openForOpportunities(true);
        sarah.salary(95000);
        sarah.openForOpportunities(false);

        Employee engineer = new Employee("software engineer", "Facebook");
        Employee manager = new Employee("product manager", "Twitter");

        engineer.salary(150000);
        engineer.openForOpportunities(false);
        manager.salary(250000);
        manager.openForOpportunities(true);

        JobSearch chris = new Person("Chris", "Smith");
        JobSearch marketer = new Employee("marketer", "Amazon");

        chris.salary(100000);
        chris.openForOpportunities(true);
        marketer.salary(90000);
        marketer.openForOpportunities(false);


    }
}
