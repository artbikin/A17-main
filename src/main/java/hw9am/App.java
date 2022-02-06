package hw9am;

public class App {

    public static void main(String[] args) {

        Computer comp1 = new Computer("Dell", 2019, 900, "500GB", "8GB");
        comp1.computerDetails();

        Computer comp2 = new Computer();
        comp2.setBrand("Apple");
        comp2.setYear(2020);
        comp2.setPrice(2500);
        comp2.setStorage("1000GB");
        comp2.setMemory("16GB");
        comp2.computerDetails();

        Phone phone1 = new Phone("Samsung", "S20", 1000, 2020);
        phone1.phoneDetails();

        Phone phone2 = new Phone();
        phone2.setBrand("Apple");
        phone2.setModel("iPhone 12 Pro");
        phone2.setPrice(1000);
        phone2.setYear(2020);
        phone2.phoneDetails();

        House house1 = new House("condo", 1, 2, 2, 1500);
        house1.houseDetails();

        House house2 = new House();
        house2.setType("single family home");
        house2.setStories(3);
        house2.setSqft(2500);
        house2.setBed(5);
        house2.setBath(4);
        house2.houseDetails();

        Job qaEngineer = new Job("tech", "QA engineer", 5, 120000);
        qaEngineer.hello("Alex");

        Job productManager = new Job();
        productManager.setIndustry("ecommerce");
        productManager.setRole("Product Manager");
        productManager.setYoe(10);
        productManager.setSalary(250000);
        productManager.hello("Natalie");



    }
}
