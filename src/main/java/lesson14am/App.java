package lesson14am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        // sets
        // hash set
        // sets have only unique values
        // there are no indexes in sets, no order

        Set<String> colors = new HashSet<>();
        colors.add("Red");
        System.out.println(colors);
        System.out.println(colors.size());

        colors.add("Green");
        System.out.println(colors);
        System.out.println(colors.size());

        colors.add("Blue");
        System.out.println(colors);
        System.out.println(colors.size());

        colors.add("Red");
        System.out.println(colors);
        System.out.println(colors.size());

        // only use case for the set
        // check if value is present in the set

        boolean hasRed = colors.contains("Red");
        System.out.println(hasRed);

        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
