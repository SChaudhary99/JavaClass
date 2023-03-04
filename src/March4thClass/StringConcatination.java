package March4thClass;

/**
 * Constructor overload and method overload examples
 */
public class StringConcatination {

    String firstName;
    String middleName;
    String lastName;
    int age;

    public StringConcatination(){

    }
    public StringConcatination(String firstName){
        this(firstName,null,null,0);

    }
    public StringConcatination(String firstName, String middleName){
        this(firstName,middleName,null,0);

    }
    public StringConcatination(String firstName, String middleName, String lastName){
        this(firstName,middleName,lastName,0);
    }
    public StringConcatination(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;

    }
    public void displayName(String a){
        System.out.println("My name is "+a);
    }
    public void displayName(String a, String b){
        System.out.println("My name is "+a+" "+b);
    }
    public void displayName(String a, String b, String c){
        System.out.println("My name is "+a+ " "+b+" "+c);
    }
    public void displayName(String a, int b){
        System.out.println(a+"'s age is "+b);
    }
}
