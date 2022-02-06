package lesson10am;

public class SubstituteTeacher extends Teacher{

    private String schedule;

    public SubstituteTeacher(String name, String lastName, int year, Subjects subject, String schedule) {
        super(name, lastName, year, subject);
        this.schedule = schedule;
    }

    public SubstituteTeacher(String schedule) {
        this.schedule = schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }
}
