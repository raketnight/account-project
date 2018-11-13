import org.junit.Assert;
import org.junit.Before;
import  org.junit.Test;

public class Tests {


    @Test
    public void testAccount1(){
        Service service = new Service();
        Account raket = new Account("Raket", "Makhim", "1");
        service.insertMap(raket);

        PeopleFinder finder = new PeopleFinder();

        Assert.assertEquals(1, finder.FindInstanceOfFirstName("Raket"));
    }

    @Test
    public void testAccount(){
        Service service = new Service();
        Account raket = new Account("Romio", "Makhim", "2");
        service.insertMap(raket);
        Account rake = new Account("Romio", "Makhism", "3");
        service.insertMap(rake);
        PeopleFinder finder = new PeopleFinder();


        Assert.assertEquals(2, finder.FindInstanceOfFirstName("Romio"));
    }


}
