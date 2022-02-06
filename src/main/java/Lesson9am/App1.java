package Lesson9am;

public class App1 {
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Wilson", 1995);

        // calling empty constructor
        Student david = new Student();

        // each of these constructors has a unique signature
        // different number of parameters = different signature
        Student peter = new Student("Peter", "Johnson");

    }
}
