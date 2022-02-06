package hw8am;

public class App {

    public static void main(String[] args) {
        Job qaEngineer = new Job();
        qaEngineer.industry = "tech";
        qaEngineer.role = "QA Engineer";
        qaEngineer.yoe = 5;
        qaEngineer.salary = 120000;
        qaEngineer.hello("Alex");

        Job productManager = new Job();
        productManager.industry = "ecommerce";
        productManager.role = "Product Manager";
        productManager.yoe = 10;
        productManager.salary = 250000;
        productManager.hello("Natalie");

        House house1 = new House();
        house1.type = "condo";
        house1.stories = 1;
        house1.sqft = 1000;
        house1.bed = 2;
        house1.bath = 2;
        house1.houseDetails();

        House house2 = new House();
        house2.type = "single family home";
        house2.stories = 3;
        house2.sqft = 2500;
        house2.bed = 5;
        house2.bath = 4;
        house2.houseDetails();

        Computer comp1 = new Computer();
        comp1.brand = "Dell";
        comp1.year = 2018;
        comp1.price = 900;
        comp1.storage = "500GB";
        comp1.memory = "8GB";
        comp1.computerDetails();

        Computer comp2 = new Computer();
        comp2.brand = "Apple";
        comp2.year = 2020;
        comp2.price = 2500;
        comp2.storage = "1000GB";
        comp2.memory = "16GB";
        comp2.computerDetails();

        Phone phone1 = new Phone();
        phone1.brand = "Samsung";
        phone1.model = "S20";
        phone1.price = 1000;
        phone1.year = 2020;
        phone1.phoneDetails();

        Phone phone2 = new Phone();
        phone2.brand = "Apple";
        phone2.model = "iPhone 12 Pro";
        phone2.price = 1000;
        phone2.year = 2020;
        phone2.phoneDetails();

    }
}
