package lesson14am;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {

        // hash map - two values: key and value
        // key must be unique

        // use "put" to put into the bag, no order

        Map<String, String> capitals = new HashMap<>();
        capitals.put("Canada", "Ottawa");
        capitals.put("Germany", "Berlin");
        capitals.put("China", "Beijing");
        capitals.put("India", "New Delhi");

        capitals.put("Germany", "Bonn");
        System.out.println(capitals);

        // key is an index for the value in the hash map
        System.out.println(capitals.get("Germany"));

        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "Red");
        colors.put(1, "Red");
        colors.put(2, "Green");

        System.out.println(colors.get(2));

        capitals.replace("Germany", "Berlin");
        System.out.println(capitals);

        // iterate through the hash map
        // can iterate by keys
        // cam iterate by values
        // can iterate by keys AND values

        Set<String> countries = capitals.keySet();
        System.out.println(countries);

        for (String country : capitals.keySet()){
            System.out.println(country);
        }

        Collection<String> cities = capitals.values();
        System.out.println(cities);

        for (String city : capitals.values()){
            System.out.println(city);
        }

        for (Map.Entry<String, String> pair : capitals.entrySet()){
            System.out.println("Country = "+pair.getKey()+ ", capital = "+ pair.getValue());
        }

        Map<Person, Fruit> xx = new HashMap<>();
        xx.put(new Person("Anna", "Smith"), new Fruit("Apple"));
        System.out.println(xx);

    }
}
