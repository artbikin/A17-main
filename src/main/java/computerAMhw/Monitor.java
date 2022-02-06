package computerAMhw;

public class Monitor {
    private String make;
    private String model;
    private int diagonal;

    public Monitor(String make, String model, int diagonal) {
        this.make = make;
        this.model = model;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
}
