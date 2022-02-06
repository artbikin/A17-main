package lesson9;

public class App1 {
    public static void main(String[] args) {
        Student anna = new Student("Anna","Wilson",1995);
        Student david = new Student();
        david.setYear(2002);
        david.setLastName("Olson");
        david.setName("David");
//        Student peter = new Student("Peter","Jonson");
//        peter.setYear(2001);

        anna.printStudent();
        david.printStudent();
    }
}
