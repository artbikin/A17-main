package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Tickets;

public class TicketsTest {
    @Test
    public void testTicket_infant_complimentaryTicket(){
        Tickets passenger = new Tickets(1,1000);
        double result = passenger.getPrice();
        Assert.assertEquals(result,0.0,"Hello");
    }
    @Test
    public void testTicket_child_halfPrice(){
        Tickets passenger = new Tickets(8,500);
        double result = passenger.getPrice();
        Assert.assertEquals(result,250.0);
    }
    @Test
    public void testTicket_adult_halfPrice(){
        Tickets passenger = new Tickets(18,1500);
        double result = passenger.getPrice();
        Assert.assertEquals(result,1500.0);
    }
    @Test
    public void testTicket_senior_halfPrice(){
        Tickets passenger = new Tickets(68,1000);
        double result = passenger.getPrice();
        Assert.assertEquals(result,800.0);
    }

}
