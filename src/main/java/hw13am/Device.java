package hw13am;

public class Device {
    private String make;
    private String type;

    public Device(String make, String type) {
        this.make = make;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
