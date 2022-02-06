package lesson9;

public class Student {
    private String name;
    private String lastName;
    private int year;

    public Student(String name, String lastName, int year){
        this.lastName=lastName;
        this.name=name;
        this.year=year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student(){}

    public Student(String name,String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public Student(String name){
        this.name=name;
    }
//    public Student(String lastName){
//        this.lastName=lastName;
//    }

    public void setYear(int year){
        this.year=year;
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
    public void printStudent(){
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(year);
    }
}
