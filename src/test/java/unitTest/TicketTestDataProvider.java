package unitTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tickets.Tickets;

public class TicketTestDataProvider {
    @DataProvider(name = "tickets")
    public Object[][] getData(){
        return new Object[][]{
                {1,1000,0.0},
                {2,1000,0.0},
                {3,1000,500.0,},
                {5,1000,500.0},
                {12,1000,500.0},
                {13,1000,1000.0},
                {25,1000,1000.0},
                {65,1000,1000.0},
                {66,1000,800.0},
                {75,1000,800.0},
                {90,1000,800.0}
        };
    }

    @Test(dataProvider = "tickets")
    public void ticketTest(int age, int basePrice,double expectedPrice){
        Tickets passenger = new Tickets(age,basePrice);
        double result = passenger.getPrice();
        Assert.assertEquals(result,expectedPrice);
    }

}
