package lesson9;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();

        anna.setName("Anna");
        String xx = anna.getName();
        System.out.println(xx);

        anna.setLastName("Wilson");
//        System.out.println(anna.getLastName());
        anna.printFullName();

        anna.setYear(2010);
        System.out.println(anna.getYear());

//        int[]numbers = {1,2,1};
//        numbers[7] = 9;

//        int a=5;
//        int b = 0;
//        int c = a/b;

        Vehicle myCar = new Vehicle();
        myCar.setMake("Honda");
        myCar.setModel("Odyssey");
        myCar.setYear(2012);
        myCar.setYear(2011);


    }
}
