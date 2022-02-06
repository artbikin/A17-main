package lesson10;

public class Student extends Person{
    private Subjects major;

    public Student(String name, String lastName, int year, Subjects major) {
        super(name,lastName,year);
        this.major = major;
    }

    public Student() {
    }

    public Subjects getMajor() {
        return major;
    }

    public void setMajor(Subjects major) {
        this.major = major;
    }
}
