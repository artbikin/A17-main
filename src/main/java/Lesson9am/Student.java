package Lesson9am;

public class Student {
    private String name;
    private String lastName;
    private int year;

    // constructor
    // basically a bulk setter
    // this example is a full constructor
    public Student(String name, String lastName, int year){
        this.lastName = lastName;
        this.name = name;
        this.year = year;
    }

    // empty constructor
    public Student(){}

    public Student(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getYear(){
        return this.year;
    }

}
