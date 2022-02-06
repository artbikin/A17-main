package myHomework13;

import java.util.ArrayList;

public class myApp {
    public static void main(String[] args){

        // Array 1 Vinyl

        ArrayList<String>Vinyl = new ArrayList<String>();
        Vinyl.add("ACDC");
        Vinyl.add("Deep Purple");
        Vinyl.add("Pearl Jam");
        Vinyl.add("Stone Sour");
        System.out.println(Vinyl);

        Vinyl.add(0, "Slipknot");
        System.out.println(Vinyl);

        Vinyl.remove("ACDC");
        System.out.println(Vinyl);

        String d = Vinyl.set(1, "Pantera");
        System.out.println(d);
        System.out.println(Vinyl);

        for (String q : Vinyl) {
            System.out.println("The band is " + q);
        }

        boolean result = Vinyl.contains("Pantera");
        System.out.println(result);



        // Array 2 Bedrooms
        ArrayList<Integer> Bedrooms = new ArrayList<>();
        Bedrooms.add(0, 1);
        Bedrooms.add(1, 2);
        Bedrooms.add(2, 3);
        Bedrooms.add(3, 4);
        Bedrooms.add(4, 5);
        System.out.println(Bedrooms);

        Bedrooms.set(4, 6);
        System.out.println(Bedrooms);
        if (Bedrooms.get(4) >4)
        {
            System.out.println("Good");
        }
            else {
                System.out.println("Not Good");
        }


        // Array 3 true/false
        ArrayList<Boolean> Truth = new ArrayList<>();
        Truth.add(0, true);
        Truth.add(1, true);
        Truth.add(2, false);
        Truth.add(3, false);
        Truth.add(4, true);
        System.out.println(Truth);
        System.out.println(Truth.get(0));

        Truth.set(0, false);
        System.out.println(Truth);

        // Array 4 newClass

        ArrayList<newClass> newCL = new ArrayList<>();
        System.out.println(newCL);
        newClass c = new newClass("general", "big", "volume50", "a");
        newClass v = new newClass("genrall", "bigg", "volume5000", "aa");

        System.out.println(c.getCategory());
        newCL.add(c);
        newCL.add(v);
        System.out.println(v.getParametr());
    }
}
