package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Tickets;

public class TicketsTestNew {
    @Test
    public void testTicket_infant_complimentaryTicket1(){
        // Arrange - Given - Preparation - Preconditions
        Tickets passenger = new Tickets(1,1000);

        // Act - When - Test
        double result = passenger.getPrice();

        // Assert - Then - Compare EXPECTED and ACTUAL results
        Assert.assertEquals(result,0.0,"Hello");
    }
    @Test
    public void testTicket_child_halfPrice1(){
        Tickets passenger = new Tickets(8,500);

        double result = passenger.getPrice();

        Assert.assertEquals(result,250.0);
    }
    @Test
    public void testTicket_adult_halfPrice1(){
        Tickets passenger = new Tickets(18,1500);

        double result = passenger.getPrice();

        Assert.assertEquals(result,1500.0);
    }
    @Test
    public void testTicket_senior_halfPrice1(){
        Tickets passenger = new Tickets(68,1000);

        double result = passenger.getPrice();

        Assert.assertEquals(result,800.0);
    }

}
