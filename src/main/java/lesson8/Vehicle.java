package lesson8;

public class Vehicle {
    public int year;
    public String make;
    public String model;
    public String color;

    public void printCarInfo(){
        System.out.println("Car Model = "+this.model+"\nMake = "+this.make+"\nYear = "+this.year+"\nColor = "+this.color);
    }
}
