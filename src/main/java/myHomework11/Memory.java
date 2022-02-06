package myHomework11;

public class Memory {
    private String make;
    private String model;
    private int size;
    //Finish Class

    public Memory(String make, String model, int size) {
        this.make = make;
        this.model = model;
        this.size = size;
    }

    public Memory() {
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}