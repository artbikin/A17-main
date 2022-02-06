package myHomework11;

public class PowerSupply {
    private String make;
    private String model;
    private int watts;
    // Finish class

    public PowerSupply(String make, String model, int watts) {
        this.make = make;
        this.model = model;
        this.watts = watts;
    }

    public PowerSupply() {
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

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }
}