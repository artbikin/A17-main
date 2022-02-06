package homework9;

public class MyApp {
    public static void main(String[] args){

// full constructor
        Cat Black = new Cat("black", "street", "no");
        Black.printAllInfo();


// default constructor
        Cat Chapo = new Cat();
        Chapo.setColour("white");
        Chapo.setBreed("persian");
        Chapo.setSpots("lots of");

        Chapo.printAllInfo();


    }
}
