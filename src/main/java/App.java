import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {


    public static void main(String []args) throws JsonProcessingException {

        Service service = new Service();

        new Account("Raket", "Makhim", "1");
        new Account("Aharan", "Manoharan", "2");

        System.out.print(service.getRightHereMap());

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(service.getRightHereMap());
        System.out.print(json);

    }
}
