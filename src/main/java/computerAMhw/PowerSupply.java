package computerAMhw;

public class PowerSupply {
    private String make;
    private String model;
    private int watts;

    public PowerSupply(String make, String model, int watts) {
        this.make = make;
        this.model = model;
        this.watts = watts;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", watts=" + watts +
                '}';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getWatts() {
        return watts;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }
}
