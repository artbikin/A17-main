package ticketsAM;

public class Tickets {
    private int age;
    private int basePrice;

    public Tickets(int age, int basePrice) {
        this.age = age;
        this.basePrice = basePrice;
    }

    public double getPrice(){
        if (age<=2){
            return 0;
        }
        else if (age<13){
            return basePrice* 0.5;
        }
        else if (age>65){
            return basePrice * 0.8;
        }
        else{
            return basePrice;
        }
    }

}

// Unit testing tests only methods of the class
// Unit testing tests only public methods
