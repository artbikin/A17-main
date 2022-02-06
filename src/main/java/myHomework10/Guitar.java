package myHomework10;

public class Guitar {
    protected String brand;
    protected String model;

    public Guitar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Guitar() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
