package myHomework10;

public class sixStringGuitar extends Guitar{
    private Ganre ganre;

    public sixStringGuitar(String brand, String model, Ganre ganre) {
        super(brand, model);
        this.ganre = ganre;
    }

    public sixStringGuitar(){
    }

    public Ganre getGanre() {
        return ganre;
    }

    public void setGanre(Ganre ganre) {
        this.ganre = ganre;
    }
}
