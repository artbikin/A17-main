package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        String[]colors1 = new String[3];
        colors.add("Red");

        System.out.println(colors);
        System.out.println("Size = "+colors.size());
//        System.out.println(colors1);
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println(colors);
        System.out.println("Size = "+colors.size());

        colors.add(1,"Yellow");
        System.out.println(colors);

        System.out.println(colors.get(4));

        String oldValue = colors.set(2,"Orange");
        System.out.println(colors);
        System.out.println("Old value = "+oldValue);

        colors.add("Red");
        colors.add("Orange");
        System.out.println(colors);
        oldValue = colors.remove(6);
        System.out.println(oldValue);
        System.out.println(colors);
        colors.remove("Red");
        System.out.println(colors);

        boolean res = colors.contains("Red1");
        System.out.println(res);

//        for (String color:colors){
//            System.out.println(color);
//        }

//        for (int i = 0;i<colors.size();i++){
//            System.out.println(colors.get(i));
//        }
//        colors.forEach(x-> System.out.println(x));

//        colors.forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>();

        List<Person> people = new ArrayList<>();
        Person anna = new Person("Anna");
        Person david = new Person("David");

        people.add(anna);
        people.add(david);
        people.add(new Person("Alex"));

        System.out.println(people.contains(anna));
        System.out.println(people.contains(new Person("Alex")));

        anna.setName("Ann");
        System.out.println(people.get(0).getName());



    }
}
