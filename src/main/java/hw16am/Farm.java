package hw16am;

import hw14am.BrandPreference;
import hw14am.Phone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle,Integer> cattle = new HashMap<>();
    private List<AgreeCultural> agreeCultural = new ArrayList<>();

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public void printFarm(){
        System.out.println("The name of my farm is "+name);
        System.out.println("The address of my farm is "+address.getAddress());
        System.out.println("The cattle on my farm are as follows: ");
        for (Map.Entry<Cattle, Integer> pair : cattle.entrySet()){
            System.out.println(pair.getValue() + " " +pair.getKey());
        }
        System.out.println("The fields on my farm are as follows: ");
        for (AgreeCultural item : agreeCultural){
            System.out.println(item.getFieldsNumber() + " " + item.getNameOfCulture());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }
}
