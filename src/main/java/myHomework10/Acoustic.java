package myHomework10;

public class Acoustic extends Guitar{
    private String wood;

    public Acoustic(String brand, String model, String wood) {
        super(brand, model);
        this.wood = wood;
    }

    public Acoustic() {
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }
}
