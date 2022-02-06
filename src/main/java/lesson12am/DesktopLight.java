package lesson12am;

// class DesktopLight implements several interfaces
public class DesktopLight implements UsElectricalPlug, E27Bulb{
    private String model;
    private int price;
    private String color;

    public DesktopLight(String model, int price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // class which implements interface
    // gives real body to abstract method
    @Override
    public void keepSize() {
        System.out.println("I have US electrical plug.");
    }

    @Override
    public int getVoltage() {
        return 110;
    }
}
