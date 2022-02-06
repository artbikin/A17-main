package computerAMhw;

public class App {
    public static void main(String[] args) {

        // create 2 computers

        // computer 1

        Keyboard keyboard1 = new Keyboard("Logitech", "G915");
        Mouse mouse1 = new Mouse("Logitech", "G305");
        Monitor monitor1 = new Monitor("Samsung", "Odyssey", 24);

        // Corsair RMX Series, RM850x
        PowerSupply powerSupply1 = new PowerSupply("Corsair", "RM850X", 850);
        // SAMSUNG 970 EVO Plus SSD 500GB
        Disk disk1 = new Disk("Samsung", "970 EVO Plus", 500, DiskType.SSD);

        CPU cpu1 = new CPU("AMD", "Ryzen 5");
        Memory memory1 = new Memory("Corsair", "Vengeance LPX", 16);
        Motherboard motherboard1 = new Motherboard(cpu1, memory1);

        GraphicsCard graphicsCard1 = new GraphicsCard("Nvidia", "RTX1660", 6);

        SystemBlock systemBlock1 = new SystemBlock(powerSupply1, disk1, motherboard1, graphicsCard1);

        Computer computer1 = new Computer(keyboard1, mouse1, monitor1, systemBlock1);

        // computer 2

        Keyboard keyboard2 = new Keyboard("Razer", "Blackwidow");
        Mouse mouse2 = new Mouse("Razer", "DeathAdder");
        Monitor monitor2 = new Monitor("Razer", "Raptor", 27);

        // Corsair CX450
        PowerSupply powerSupply2 = new PowerSupply("Corsair", "CX450", 450);
        // WD_BLACK 1TB SN750
        Disk disk2 = new Disk("WD_BLACK", "SN750", 1000, DiskType.SSD);

        // Intel Core i3
        CPU cpu2 = new CPU("Intel", "Core i3");
        // TEAMGROUP T-Force Vulcan Z DDR4 16GB
        Memory memory2 = new Memory("TEAMGROUP", "T-Force Vulcan Z", 16);
        Motherboard motherboard2 = new Motherboard(cpu2, memory2);

        //  Intel Iris Xe 4GB
        GraphicsCard graphicsCard2 = new GraphicsCard("Intel", "Iris Xe", 4);

        SystemBlock systemBlock2 = new SystemBlock(powerSupply2, disk2, motherboard2, graphicsCard2);

        Computer computer2 = new Computer(keyboard2, mouse2, monitor2, systemBlock2);

        // get CPU model from computer 1

        String computer1CPUModel = computer1.getSystemBlock().getMotherboard().getCpu().getModel();
        System.out.println("The CPU model of computer 1 is "+computer1CPUModel);

        // get Memory Size from computer 2

        int computer2MemorySize = computer2.getSystemBlock().getMotherboard().getMemory().getSize();
        System.out.println("The memory size of computer 2 is "+computer2MemorySize);

    }
}
