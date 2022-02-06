package myHomework11;

public class Disk {
    private String make;
    private String model;
    private int size;
    private DiskType diskType;
    // Finish class


    public Disk(String make, String model, int size, DiskType diskType) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.diskType = diskType;
    }

    public Disk() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DiskType getDiskType() {
        return diskType;
    }

    public void setDiskType(DiskType diskType) {
        this.diskType = diskType;
    }
}