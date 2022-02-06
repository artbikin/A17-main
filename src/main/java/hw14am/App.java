package hw14am;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        // HashSet of strings
        HashSet<String> names = new HashSet<>();
        names.add("Peter");
        names.add("John");
        names.add("Mary");
        names.add("Susan");
        names.add("Hunter");
        System.out.println(names);
        names.remove("Hunter");
        names.forEach(System.out::println);

        // HashSet of car objects
        HashSet<Car> cars = new HashSet<>();
        Car bmw = new Car("BMW");
        cars.add(bmw);
        cars.add(new Car("Audi"));
        cars.add(new Car("Mercedes"));
        cars.add(new Car("Volvo"));
        for (Car car : cars) {
            System.out.println(car.getMake());
        }

        // HashMap countries and their languages
        HashMap<String, String> languages = new HashMap<>();
        languages.put("France", "French");
        languages.put("Germany", "German");
        languages.put("Spain", "Spanish");
        languages.put("United States", "English");
        languages.put("Netherlands", "Netherlandish");
        languages.replace("Netherlands", "Netherlandish", "Dutch");
        languages.remove("Spain", "Spanish");
        for (String language : languages.values()) {
            System.out.println("The language of this country is " + language);
        }

        // HashMap numbers
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(0, "zero");
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(5, "seven");
        numbers.remove(5, "seven");
        for (String number : numbers.values()){
            System.out.println(number);
        }

        // Hashmap phones
        HashMap<Phone, BrandPreference> phoneChoice = new HashMap<>();
        phoneChoice.put(new Phone("Apple", "iPhone"), new BrandPreference("Apple"));
        phoneChoice.put(new Phone("Google", "Pixel"), new BrandPreference("Google"));
        phoneChoice.put(new Phone("Samsung", "Galaxy"), new BrandPreference("Samsung"));
        phoneChoice.put(new Phone("Huawei", "Note"), new BrandPreference("Huawei"));
        for(Map.Entry<Phone, BrandPreference> pair : phoneChoice.entrySet()){
            System.out.println("This person owns a "+pair.getKey().getMake()+" " +pair.getKey().getModel()+" phone because they prefer the "+pair.getValue().getBrand() +" brand.");
        }

    }
}
