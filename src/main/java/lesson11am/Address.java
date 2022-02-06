package lesson11am;

public class Address {
    private String street1;
    private String city;
    private String zip;
    private String state;

    public Address(String street1, String city, String zip, String state) {
        this.street1 = street1;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public String toString(){
        return street1 + " " + city + " " + state + " " + zip;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet1() {
        return street1;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }
}
