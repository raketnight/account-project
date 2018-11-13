public class PeopleFinder {

    public int FindInstanceOfFirstName(String name) {
        Service service = new Service();

        int count = 0;

        for (String key : service.getRightHereMap().keySet()){

            if(service.getRightHereMap().get(key).getFirstName().equals(name)) {
                count++;
            }
        }

        System.out.print(count);
        return count;
    }
}
