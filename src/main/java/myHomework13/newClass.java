package myHomework13;

public class newClass {
    private String category;
    private String size;
    private String volume;
    private String parametr;

    public newClass(String category, String size, String volume, String parametr) {
        this.category = category;
        this.size = size;
        this.volume = volume;
        this.parametr = parametr;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getParametr() {
        return parametr;
    }

    public void setParametr(String parametr) {
        this.parametr = parametr;
    }
}
