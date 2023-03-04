package March4thClass.EncapsulationSession;

public class Student {

    private String firstName;
    private String lastName;
    private String contactNum;

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getContactNum() {
        return contactNum;
    }
}
