package Lesson8am;

public class Vehicle {
    // variable inside a class is called a field
    public int year;
    public String make;
    public String model;
    public String color;

    // function inside a class is called a method
    public void printCarInfo(){
        System.out.println("Car Model = "+this.model+",\nMake = "+make+",\nYear = "+year+",\nColor = "+color);
    }

}
