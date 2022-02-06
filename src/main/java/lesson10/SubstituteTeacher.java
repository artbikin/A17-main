package lesson10;

public final class SubstituteTeacher extends Teacher{
    private String schedule;

    public SubstituteTeacher(String name, String lastName, int year, Subjects subject, String schedule) {
        super(name, lastName, year, subject);
        this.schedule = schedule;
    }
}
