package myHomework10;

public class MyApp {
    public static void main(String[] args) {
        sixStringGuitar fisrtOne = new sixStringGuitar("fender", "great", Ganre.pop);
        sixStringGuitar secondOne = new sixStringGuitar("fender", "fnd10", Ganre.post);
        sevenSringGuitar Ibanez = new sevenSringGuitar("Ibanez", "rg7", Ganre.heavy);
        sevenSringGuitar Kramer = new sevenSringGuitar("Kramer", "KR7", Ganre.heavy);
        Acoustic Martin = new Acoustic("Martin", "auc1", "redWood");
        Acoustic Fender = new Acoustic("Fender", "Strat", "whiteWood");

        System.out.println(Ibanez.getModel());
        System.out.println(Kramer.getGanre());
        System.out.println(Fender.getClass());
    }
}
