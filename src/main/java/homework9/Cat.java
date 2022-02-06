package homework9;

public class Cat {
    private String colour;
    private String breed;
    private String spots;

                                                                            // full Constructor
    public Cat(String colour, String breed, String spots) {
        this.colour = colour;
        this.breed = breed;
        this.spots = spots;
    }

                                                                            // default Constructor (empty)
    public Cat() {}

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    public void setSpots(String spots) {
        this.spots = spots;
    }
    public String getSpots() {
        return spots;
    }


    public void printAllInfo(){
        System.out.println(this.colour + this.breed + this.spots);
        }
}

