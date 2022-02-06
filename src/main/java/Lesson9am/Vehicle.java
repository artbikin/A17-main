package Lesson9am;

// public and private are "access modifiers"
public class Vehicle {
    private String make;
    private String model;
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake(){
        return this.make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

}
