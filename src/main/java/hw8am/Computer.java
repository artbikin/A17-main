package hw8am;

public class Computer {
    public String brand;
    public int year;
    public int price;
    public String storage;
    public String memory;

    public void computerDetails(){
        System.out.println("This is a "+year+" "+brand+" computer with "+storage+" of storage and "+memory+" of RAM. It was purchased for $"+price);
    }

}
