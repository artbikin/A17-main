package hw16am;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        // create address for farm
        Address myAddress = new Address("123 Elm Street", "Party Town", "TX", 80657);

        // create map of cattle and their numbers
        Map<Cattle,Integer> myCattle = new HashMap<>();
        myCattle.put(Cattle.CHICKENS, 7);
        myCattle.put(Cattle.COWS, 12);
        myCattle.put(Cattle.PIGS, 11);
        myCattle.put(Cattle.SHEEP, 5);
        myCattle.put(Cattle.TURKEYS, 15);

        // create each agricultural object
        AgreeCultural myWheat = new AgreeCultural("wheat", 50);
        AgreeCultural mySoy = new AgreeCultural("soy", 70);
        AgreeCultural myPea = new AgreeCultural("pea", 30);

        // create agricultural list
        List<AgreeCultural> myAgreeCultural = new ArrayList<>();
        myAgreeCultural.add(myWheat);
        myAgreeCultural.add(mySoy);
        myAgreeCultural.add(myPea);

        // create farm object
        Farm myFarm = new Farm("BestFarm", myAddress, myCattle, myAgreeCultural);

        // print farm info

        myFarm.printFarm();


    }






}
