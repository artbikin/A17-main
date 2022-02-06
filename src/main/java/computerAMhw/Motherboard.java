package computerAMhw;

public class Motherboard {
    private CPU cpu;
    private Memory memory;

    public Motherboard(CPU cpu, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
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
}
