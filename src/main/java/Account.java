

 public class Account {
    private String firstName;
    private String lastName;
    private int accoutnNumber;
    //private Service service = new Service();



    private void setAccoutnNumber(Integer accoutnNumber) {
        this.accoutnNumber = accoutnNumber;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAccoutnNumber() {
        return accoutnNumber;
    }

     public Account(String firstName, String lastName, Integer accoutnNumber){
         setAccoutnNumber(accoutnNumber);
         setLastName(lastName);
         setFirstName(firstName);
         //service.insertMap(this);
     }
}
