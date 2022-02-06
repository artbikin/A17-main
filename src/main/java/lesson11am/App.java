package lesson11am;

public class App {
    public static void main(String[] args) {

        Address address = new Address("12 Elm Street", "Gotham City", "66666", "Florida");

        Person anna = new Person("Anna", "Wilson", 1998, address);

        String str = anna.getAddress().getStreet1();
        System.out.println(str);
        System.out.println(address.toString());
    }
}
