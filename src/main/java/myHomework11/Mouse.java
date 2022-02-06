package myHomework11;

public class Mouse {
    private String make;
    private String model;
    // finish class

    public Mouse(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Mouse() {
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