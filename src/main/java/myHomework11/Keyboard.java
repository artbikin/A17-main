package myHomework11;

public class Keyboard {
    private String make;
    private String model;

    public Keyboard(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Keyboard() {
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