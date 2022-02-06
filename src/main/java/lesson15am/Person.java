package lesson15am;

public class Person {
    private String name;
    private String lastName;
    private int year;
    private static int count=0;

    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        count++;
    }

    public static void doSomething(){
        System.out.println("Do something");
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCount() {
        return count;
    }

}
