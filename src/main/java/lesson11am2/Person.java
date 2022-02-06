package lesson11am2;

public class Person {
    private String name;
    private String lastName;
    private int year;
    private Address address;


    public Person(String name, String lastName, int year, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", address=" + address +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public Address getAddress() {
        return address;
    }

}
