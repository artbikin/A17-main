package hw9am;

public class House {

    private String type;
    private int stories;
    private int bed;
    private int bath;
    private int sqft;

    public House(String type, int stories, int bed, int bath, int sqft){
        this.type = type;
        this.stories = stories;
        this.bed = bed;
        this.bath = bath;
        this.sqft = sqft;
    }

    public House(){}

    public void setType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setStories(int stories){
        this.stories = stories;
    }

    public int getStories() {
        return stories;
    }

    public void setBed(int bed){
        this.bed = bed;
    }

    public int getBed() {
        return bed;
    }

    public void setBath(int bath){
        this.bath = bath;
    }

    public int getBath() {
        return bath;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public int getSqft() {
        return sqft;
    }

    public void houseDetails(){
        System.out.println("This house is a "+sqft+" square foot "+type+". It has "+stories+" stories, and "+bed+" bedrooms and "+bath+" bathrooms.");
    }

}
