package hw9am;

public class Computer {
    private String brand;
    private int year;
    private int price;
    private String storage;
    private String memory;

    public Computer(String brand, int year, int price, String storage, String memory){
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.storage = storage;
        this.memory = memory;
    }

    public Computer(){}

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
        return this.price;
    }

    public void setStorage(String storage){
        this.storage = storage;
    }

    public String getStorage(){
        return this.storage;
    }

    public void setMemory(String memory){
        this.memory = memory;
    }

    public String getMemoryOP(){
        return this.memory;
    }

    public void computerDetails(){
        System.out.println("This is a "+year+" "+brand+" computer with "+storage+" of storage and "+memory+" of RAM. It was purchased for $"+price);
    }
}
