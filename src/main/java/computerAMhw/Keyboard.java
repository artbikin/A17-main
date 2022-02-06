package computerAMhw;

public class Keyboard {
    private String make;
    private String model;

    public Keyboard(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
