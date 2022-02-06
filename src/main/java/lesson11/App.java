package lesson11;

public class App {
    public static void main(String[] args) {
        Address address = new Address("12 Elm Street","Gotham city","66666","FL");
        Address davidAddress = new Address("187 Broadway","New York","10001","NY");

        Person anna = new Person("Anna","Wolf",1998,address);
        Person david = new Person("David","Holton",1997,davidAddress);

        String str = anna.getAddress().getStreet1();
//        System.out.println(str);
        Team dreamTeam = new Team(anna,david);

        str = dreamTeam.getTeamMember1().getAddress().getStreet1();
//        System.out.println(str);


//        System.out.println(address);
        System.out.println(dreamTeam);
    }
}
