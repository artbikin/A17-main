package myHomework12;

public class Motorcylce implements Vehicle{
    private String type;
    private int year;

    public Motorcylce(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void engine(String n) {

    }

    @Override
    public void wheels() {

    }
}
