package myHomework12;

public class Car implements Vehicle {
private String perpose;
private int seates;

    public Car(String perpose, int seates) {
        this.perpose = perpose;
        this.seates = seates;
    }

    public String getPerpose() {
        return perpose;
    }

    public void setPerpose(String perpose) {
        this.perpose = perpose;
    }

    public int getSeates() {
        return seates;
    }

    public void setSeates(int seates) {
        this.seates = seates;
    }

    @Override
    public void engine(String n) {
        System.out.println("You will need an engine minimum of " + n);
    }

    @Override
    public void wheels() {
        System.out.println("You will need 4 wheels");

    }
}
