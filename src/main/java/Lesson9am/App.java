package Lesson9am;

public class App {
    public static void main(String[] args) {

        // Incapsulation
        // first pillar of OOP

        // do not see fields suggested
        // because they are private
        // need special method to set fields, setter
        Person anna = new Person();
        anna.setName("Anna");
        anna.setLastName("Johnson");
        String annaName = anna.getName();
        String annaLastName = anna.getLastName();
        System.out.println(annaName);
        System.out.println(annaLastName);

        anna.setYear(1990);
        System.out.println(anna.getYear());

        Vehicle myCar = new Vehicle();
        myCar.setYear(2020);
        myCar.setMake("Honda");
        myCar.setModel("Civic");



    }

}
