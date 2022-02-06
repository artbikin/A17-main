package Lesson9am;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setYear(int year){
        if(year>2021 || year < 1900){
            throw new IllegalArgumentException("Year is wrong.");
        }
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public void printFullName(){
        System.out.println(this.name + " " + this.lastName);
    }

}
