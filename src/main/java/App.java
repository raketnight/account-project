

public class App {


    public static void main(String []args){

        Service service = new Service();

        new Account("Raket", "Makhim", "1");
        new Account("Aharan", "Manoharan", "2");

        System.out.print(service.getRightHereMap());

    }
}
