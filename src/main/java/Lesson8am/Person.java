package Lesson8am;

public class Person {
    public String name;
    public String lastName;
    public int year;

    public void introduce(String name){
        System.out.println("Hello, "+name+" my name is "+this.name+" "+this.lastName);
    }
}
