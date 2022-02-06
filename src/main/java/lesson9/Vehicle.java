package lesson9;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
