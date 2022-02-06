package lesson8;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Wilson";
        anna.year = 1995;


//        System.out.println("Last name of person is "+anna.lastName);

        Person david = new Person();
        david.lastName = "Peterson";
        david.name = "David";
        david.year=1997;

        Person mary = new Person();
        mary.lastName = "Peterson";
        mary.name ="Mary";
        mary.year = 2001;

        mary.year = 2002;

        Vehicle myCar = new Vehicle();
        myCar.color = "Pink";
        myCar.make="Toyota";
        myCar.model="Camry";
        myCar.year=1991;

//        System.out.println("My car has ".concat(myCar.color).concat(" color"));

//        myCar.printCarInfo();

        Vehicle artemCar = new Vehicle();
        artemCar.make = "Honda";
        artemCar.year=2020;
        artemCar.color="Silver";
        artemCar.model = "Accent";

//        artemCar.printCarInfo();

        anna.introduce("John");
        david.introduce("Jonatan");


    }
}
