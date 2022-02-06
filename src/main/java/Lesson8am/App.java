package Lesson8am;

public class App {
    public static void main(String[] args) {

        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Wilson";
        anna.year = 1995;

        System.out.println("Last name of this person is "+ anna.lastName);

        Person david = new Person();
        david.lastName = "Peterson";
        david.name = "David";
        david.year = 1997;

        Person mary = new Person();
        mary.lastName = "Peterson";
        mary.name = "Mary";
        mary.year = 1997;

        Vehicle myCar = new Vehicle();
        myCar.color = "Pink";
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 1991;

        System.out.println("My car is a "+myCar.color+" "+myCar.year + " " +myCar.make + " " + myCar.model);

        //myCar.printCarInfo();

        Vehicle artemCar = new Vehicle();
        //artemCar.printCarInfo();

        anna.introduce("John");
        david.introduce("Jonathan");

    }
}
