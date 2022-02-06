package myHomework10;

public class sevenSringGuitar extends Guitar{
    private Ganre ganre;

    public sevenSringGuitar(String brand, String model, Ganre ganre) {
        super(brand, model);
        this.ganre = ganre;
    }

    public sevenSringGuitar() {
    }

    public Ganre getGanre() {
        return ganre;
    }

    public void setGanre(Ganre ganre) {
        this.ganre = ganre;
    }
}
