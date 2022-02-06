package myHomework11;

public class App {
    public static void main(String[] args) {
        // Create 2 computers


//Computer 1
        Keyboard keyboard1 = new Keyboard("HP", "KG-11");
        Mouse mouse1 = new Mouse("HP", "Mnt-22");
        Monitor monitor1 = new Monitor("HP", "HP27 Backlit", 19);

        CPU cpu1 = new CPU("Intel", "Core i-5");
        Memory memory1 = new Memory("HP", "Mem-600", 600);
        MotherBoard motherBoard1 = new MotherBoard(cpu1, memory1, "Chipset1");

        PowerSupply powerSupply1 = new PowerSupply();
        Disk disk1 = new Disk("HPE", "MSA", 1024, DiskType.HDD);
        GraphicAdapter graphicAdapter1 = new GraphicAdapter("GeForce", "GTX-16", 16);
        SystemBlock systemBlock1 = new SystemBlock(powerSupply1, disk1, graphicAdapter1, motherBoard1);
        Computer HP1 = new Computer("HP", "Custom", keyboard1, mouse1, monitor1, systemBlock1);

        String cpu = HP1.getSystemBlock().getMotherBoard().getCpu().getModel();
        System.out.println(cpu);

        // Get CPU model from computer 1
        // Get Memory size from computer 2

    }
}