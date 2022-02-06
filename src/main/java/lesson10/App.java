package lesson10;

public class App {
    public static void main(String[] args) {
        Student anna = new Student("Anna","Wilson",1999,Subjects.MATH);
        Student david = new Student();
        david.setYear(1998);
        david.setName("David");
        david.setMajor(Subjects.ACCOUNTING);
        david.setLastName("Peterson");

        Teacher msDavis = new Teacher("Margaret","Davis",1985,Subjects.HISTORY);

        SubstituteTeacher mrJones = new SubstituteTeacher("Alex","Jones",1987,Subjects.BIOLOGY,"Free");

        System.out.println(mrJones.getLastName());


        String aa = new String("Some words");
        String bb = "Hi";

    }
}
