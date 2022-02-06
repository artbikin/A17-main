package myHomework11;

public class MotherBoard {
    private CPU cpu;
    private Memory memory;
    private String chipset;
    //Finish class

    public MotherBoard(CPU cpu, Memory memory, String chipset) {
        this.cpu = cpu;
        this.memory = memory;
        this.chipset = chipset;
    }

    public MotherBoard() {
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
}