package lesson15;

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
        System.out.println(count);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }


    public int getYear() {
        return year;
    }


    public int getCount() {
        return count;
    }

}
