package lesson10am;

public class App {
    public static void main(String[] args) {

        // inheritance
        // second pillar of OOP

        Student anna = new Student("Anna", "Wilson", 1999, Subjects.MATH);
        Student david = new Student(){};
        david.setName("David");
        david.setLastName("Peterson");
        david.setYear(1998);
        david.setMajor(Subjects.ACCOUNTING);

        Teacher msDavis = new Teacher("Margaret", "Davis", 1985, Subjects.HISTORY);

        SubstituteTeacher mrJones = new SubstituteTeacher("Alex", "Jones", 1987, Subjects.BIOLOGY, "Free");

        System.out.println(mrJones.getLastName());

        Rectangle r1 = new Rectangle(5, 3);
        r1.draw();
        System.out.println("Area = "+r1.area());

        System.out.println("Perimeter = "+r1.perimeter());

        Square s1 = new Square(7);
        System.out.println("Area = "+s1.area());
        System.out.println("Perimeter = "+s1.perimeter());
        s1.draw();

    }
}
