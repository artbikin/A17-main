package hw9am;

public class Phone {
    private String brand;
    private String model;
    private int year;
    private int price;

    public Phone(String brand, String model, int year, int price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Phone(){}

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void phoneDetails(){
        System.out.println("This "+year+" "+brand+" "+model+" was purchased for $"+price);
    }
}
