package hw13am;

import java.sql.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Mazda");
        System.out.println(cars);

        cars.set(1, "Kia");
        cars.remove("Mazda");
        cars.add("Honda");
        cars.add("Mazda");

        cars.forEach(System.out::println);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums.get(3));
        nums.remove(0);
        nums.forEach(System.out::println);

        ArrayList<Device> devices = new ArrayList<>();

        Device macbook = new Device("Apple", "computer");
        Device surface = new Device("Windows", "computer");
        Device iPhone = new Device("Apple", "phone");
        Device pixel = new Device("Google", "phone");

        devices.add(macbook);
        devices.add(surface);
        devices.add(iPhone);
        devices.add(pixel);

        devices.add(new Device("OnePlus", "9"));
        devices.forEach(x -> System.out.println(x.getMake()+" "+x.getType()));



    }
}
