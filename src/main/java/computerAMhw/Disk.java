package computerAMhw;

public class Disk {
    private String make;
    private String model;
    private int size;
    private DiskType diskType;

    public Disk(String make, String model, int size, DiskType diskType) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.diskType = diskType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public DiskType getDiskType() {
        return diskType;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDiskType(DiskType diskType) {
        this.diskType = diskType;
    }
}
