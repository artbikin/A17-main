package myHomework11;

public class GraphicAdapter {
    private String make;
    private String model;
    private int memorySize;
    // Finish class

    public GraphicAdapter(String make, String model, int memorySize) {
        this.make = make;
        this.model = model;
        this.memorySize = memorySize;
    }

    public GraphicAdapter() {
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

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}