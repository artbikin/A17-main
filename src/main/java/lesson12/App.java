package lesson12;

public class App {
    public static void main(String[] args) {

//        System.out.println("XXX".length());
//        System.out.println("Hello".charAt(0));

        LaserPrinter hp10 = new LaserPrinter("HP","L10",250);
        DesktopLight dd = new DesktopLight("DD",15,"Green");

        UsElectricalPlug xx = new DesktopLight("XX",20,"Red");
        UsElectricalPlug bb = new LaserPrinter("BB","M1",12);

        UsElectricalPlug[] devices = {hp10,dd,xx,bb};

        for (UsElectricalPlug plug:devices){
            plug.keepSize();
        }
    }
}
