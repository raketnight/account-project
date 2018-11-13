import java.util.HashMap;

import org.json.JSONObject;

 public class Service {
    private static HashMap<Integer, Account> rightHereMap = new HashMap<Integer, Account>();

    public JSONObject jmapper(){
        return new JSONObject(rightHereMap);
     }

    public HashMap<Integer, Account> getRightHereMap() {
        return rightHereMap;
    }

    public void insertMap(Account acc){
        rightHereMap.put(acc.getAccoutnNumber(), acc);
    }

}
