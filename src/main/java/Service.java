import java.util.*;

 class Service {
    private static Map<String, String> rightHereMap = new HashMap<String, String>();

    Map<String, String> getRightHereMap() {
        return rightHereMap;
    }

    void insertMap(Account acc){
        rightHereMap.put(acc.getFirstName() + " " + acc.getLastName(), acc.getAccoutnNumber());
    }

}
