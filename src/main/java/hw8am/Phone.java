package hw8am;

public class Phone {
    public String brand;
    public String model;
    public int year;
    public int price;

    public void phoneDetails(){
        System.out.println("This "+year+" "+brand+" "+model+" was purchased for $"+price);
    }

}
