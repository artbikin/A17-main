package hw8am;

public class House {
    public String type;
    public int stories;
    public int bed;
    public int bath;
    public int sqft;

    public void houseDetails(){
        System.out.println("This house is a "+sqft+" square foot "+type+". It has "+stories+" stories, and "+bed+" bedrooms and "+bath+" bathrooms.");
    }

}
