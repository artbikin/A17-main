package lesson15am;

public class App {
    public static void main(String[] args) {

        Person anna = new Person("Anna", "Wilson", 1998);
        System.out.println(anna.getCount());

        Person david = new Person("David", "Patterson", 1997);
        System.out.println(anna.getCount());
        System.out.println(david.getCount());

        Person max = new Person("Max", "Simons", 2001);
        System.out.println(anna.getCount());
        System.out.println(david.getCount());
        System.out.println(max.getCount());

        // static field is a field that is shared between all objects of the class

        // cannot call from object
        // david.doSomething() --> CANNOT
        // must call from class
        // static class belong to Class, not object
        Person.doSomething();

        hi();

        // use static function
        // do not need to create object Helper
        // can just call the method from the class
        double xx = Helper.areaOfCircle(5);


    }

    public static void hi(){
        System.out.println("Hi");
    }

}
