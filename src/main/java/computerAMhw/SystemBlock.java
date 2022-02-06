package computerAMhw;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Disk disk;
    private Motherboard motherboard;
    private GraphicsCard graphicsCard;

    public SystemBlock(PowerSupply powerSupply, Disk disk, Motherboard motherboard, GraphicsCard graphicsCard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.motherboard = motherboard;
        this.graphicsCard = graphicsCard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public Disk getDisk() {
        return disk;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
