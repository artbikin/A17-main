package myHomework11;

public class Monitor {
    private String make;
    private String model;
    private int diagonal;
    // Finish class

    public Monitor(String make, String model, int diagonal) {
        this.make = make;
        this.model = model;
        this.diagonal = diagonal;
    }

    public Monitor() {
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

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
}