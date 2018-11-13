
public class App {


    public static void main(String []args)  {

        Service service = new Service();

        Account raket = new Account("Raket", "Makhim", 1);
        Account aha = new Account("Aharan", "Manoharan", 2);


        service.insertMap(raket);
        service.insertMap(aha);

        System.out.print(service.getRightHereMap());

        System.out.print(service.jmapper());

    }
}
