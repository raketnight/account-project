import java.util.HashMap;

import org.json.JSONObject;

 public class Service {
    private static HashMap<String, Account> rightHereMap = new HashMap<String, Account>();

    public JSONObject jmapper(){
        return new JSONObject(rightHereMap);
     }

    public HashMap<String, Account> getRightHereMap() {
        return rightHereMap;
    }

    public void insertMap(Account acc){
        rightHereMap.put(acc.getAccoutnNumber(), acc);
    }

}
