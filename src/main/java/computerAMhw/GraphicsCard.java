package computerAMhw;

public class GraphicsCard {
    private String make;
    private String model;
    private int memorySize;

    public GraphicsCard(String make, String model, int memorySize) {
        this.make = make;
        this.model = model;
        this.memorySize = memorySize;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}
