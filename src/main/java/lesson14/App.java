package lesson14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {
    public static void main(String[] args) {
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

        boolean hasRed = colors.contains("Red");
        System.out.println(hasRed);

//        for (String color:colors){
//            System.out.println(color);
//        }

        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
