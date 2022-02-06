package lesson11am2;

public class App {

    public static void main(String[] args) {
        // Objects consist of other objects
        Address address = new Address("12 Elm Street", "Gotham", "123456", "Florida");
        Address davidAddress = new Address("187 Broadway", "New York", "10001", "New York");

        Person anna = new Person("anna", "Wilson", 1998, address);
        Person david = new Person("David", "Holton", 1997, davidAddress);

        // chaining of getters
        // get object "anna"
        // from anna get object "address"
        // from address get string "street"
        String str = anna.getAddress().getStreet1();
        System.out.println(str);

        Team dreamTeam = new Team(anna, david);

        String strDavid = dreamTeam.getTeamMember1().getAddress().getStreet1();
        System.out.println(strDavid);

        // can print because we have a toString() function in the Address Class
        System.out.println(address);
        System.out.println(dreamTeam);
    }



}
