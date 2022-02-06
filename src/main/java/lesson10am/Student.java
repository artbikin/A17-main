package lesson10am;

public class Student extends Person{

    private Subjects major;

    public Student(String name, String lastName, int year, Subjects major) {
        super(name, lastName, year);
        this.major = major;
    }

    public Student() {}


    public void setMajor(Subjects major) {
        this.major = major;
    }

    public Subjects getMajor() {
        return major;
    }
}
