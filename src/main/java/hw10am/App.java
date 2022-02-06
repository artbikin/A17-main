package hw10am;

public class App {

    public static void main(String[] args) {
        Job ceo = new Job(){};
        ceo.setPosition("CEO");
        ceo.setCompany("a Bay Area startup");
        ceo.setYoe(20);
        ceo.setSalary(500000);
        ceo.describe();

        Job vp = new Job("VP", 15, 400000, "Uber");
        vp.describe();

        Engineer seniorSDET = new Engineer(){};
        seniorSDET.setPosition("Senior SDET");
        seniorSDET.setCompany("Snap");
        seniorSDET.setYoe(7);
        seniorSDET.setSalary(300000);
        seniorSDET.describe();

        Engineer softwareEngineer = new Engineer("Staff Software Engineer", 9, 350000, "TikTok");
        softwareEngineer.describe();

        ProductManager productManger = new ProductManager(){};
        productManger.setPosition("Product Manager");
        productManger.setCompany("Apple");
        productManger.setYoe(5);
        productManger.setSalary(300000);
        productManger.describe();

        ProductManager seniorProductManager = new ProductManager("Senior Product Manger", 10, 500000, "Google");
        seniorProductManager.describe();

        Marketer marketingManager = new Marketer(){};
        marketingManager.setPosition("Marketing Manager");
        marketingManager.setCompany("Dropbox");
        marketingManager.setYoe(5);
        marketingManager.setSalary(200000);
        marketingManager.describe();

        Marketer chiefMarketingOfficer = new Marketer("Chief Marketing Officer", 15, 700000, "Twitter");
        chiefMarketingOfficer.describe();

    }


}
