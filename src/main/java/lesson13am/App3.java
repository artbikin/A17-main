package lesson13am;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {

        // a Wrapper for arrays
        // array list
        // array list is a class, it has methods
        ArrayList<String> colors = new ArrayList<>();

        // array does not have methods
        // when creating array, must provide size and size is fixed
        String[] colors1 = new String[3];

        colors.add("Red");
        System.out.println(colors);
        System.out.println("Size = "+colors.size());

        // ArrayList size is flexible, can be changed

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);
        System.out.println("Size = "+colors.size());

        // Insert Yellow at index 1
        colors.add(1, "Yellow");
        System.out.println(colors);

        // get value at index 4
        System.out.println(colors.get(4));

        // set new value at index 2
        colors.set(2, "Orange");
        System.out.println(colors);

        colors.add("Red");
        colors.add("Orange");
        System.out.println(colors);

        // remove last element by index
        String oldValue = colors.remove(6);
        System.out.println(colors);

        // we have two Reds
        // remove by value, "Red"
        // this deletes the FIRST value
        colors.remove("Red");

        boolean res = colors.contains("Red");
        System.out.println(res);

        for (String color : colors){
            System.out.println(color);
        }

        // alternative method
        for (int i = 0; i < colors.size(); i ++){
            System.out.println(colors.get(i));
        }

        // alternative method
        colors.forEach(x-> System.out.println(x));

        // ArrayList does not work with ints
        List<Integer> numbers = new ArrayList<>();

        List<Person> people = new ArrayList<>();
        Person anna = new Person("Anna");
        Person david = new Person("David");
        people.add(anna);
        people.add(david);
        // in line object creation
        people.add(new Person("Alex"));

        System.out.println(people.contains(anna));
        // will be false because of reference type
        System.out.println(people.contains(new Person("Alex")));

        System.out.println(people.get(0).getName());


    }
}
