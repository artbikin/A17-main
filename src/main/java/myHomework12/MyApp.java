package myHomework12;

import java.util.Arrays;

public class MyApp {
    public static void main(String[] args){

    Car truck = new Car("delivery", 2);
    Car van = new Car("carpool", 8);

    Motorcylce road = new Motorcylce("road", 1998);
    Motorcylce sport = new Motorcylce("sport", 2020);

    Vehicle rr = new Motorcylce("road", 1990);
    Vehicle[] vehicles = {truck, van, road, sport};

    truck.engine("V8");

    }

}
