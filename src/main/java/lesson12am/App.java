package lesson12am;

public class App {
    public static void main(String[] args) {

        // POLYMORPHISM
        // interfaces and OOP
        // (webdriver is an interface)

        // implemented by class String
        // defined by CharSequence interface
        //System.out.println("XXX".length());

        LaserPrinter hp10 = new LaserPrinter("HP", "L10", 250);
        DesktopLight dd = new DesktopLight("dd", 15, "Green");


        // you can create a type of interface, placing a real class on the right
        UsElectricalPlug xx = new DesktopLight("XX", 20, "Red");
        UsElectricalPlug bb = new LaserPrinter("BB", "M1", 12);

        // BUT cannot create instance of interface, it has no body
        //UsElectricalPlug yy = new UsElectricalPlug()

        // create a single array of this interface
        UsElectricalPlug[] devices = {hp10, dd, xx, bb};

        // plug does not know which class is inside it
        for (UsElectricalPlug plug:devices){
            plug.keepSize();
        }

        // interface ACTS DIFFERENTLY depending on which object is inside



    }
}
