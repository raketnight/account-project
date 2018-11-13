import org.junit.Assert;
import org.junit.Before;
import  org.junit.Test;

public class Tests {
    Service service = new Service();

    @Before
    public void setUp(){
        Account raket = new Account("Raket", "Makhim", "1");
        service.insertMap(raket);
    }



    @Test
    public void testAccount1(){
        PeopleFinder finder = new PeopleFinder();
        Assert.assertEquals(1, finder.FindInstanceOfFirstName("Raket"));
    }

    @Test
    public void testAccount(){

        Account raket = new Account("Romio", "Makhim", "2");
        service.insertMap(raket);
        Account rake = new Account("Romio", "Makhism", "3");
        service.insertMap(rake);
        PeopleFinder finder = new PeopleFinder();

        Assert.assertEquals(2, finder.FindInstanceOfFirstNameStreams("Romio"));
    }


}
