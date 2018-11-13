

 class Account extends  Service{
    private String firstName, lastName, accoutnNumber;
    private Service service = new Service();

    Account(String fname, String lname, String accNo){
        setAccoutnNumber(accNo);
        setLastName(lname);
        setFirstName(fname);
        service.insertMap(this);
    }

    private void setAccoutnNumber(String accoutnNumber) {
        this.accoutnNumber = accoutnNumber;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

     String getFirstName() {
        return firstName;
    }

     String getLastName() {
        return lastName;
    }

     String getAccoutnNumber() {
        return accoutnNumber;
    }
}
