package myHomework11;

public class CPU {
    private String make;
    private String model;
    //Finish Class


    public CPU(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public CPU() {
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