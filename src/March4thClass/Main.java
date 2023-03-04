package March4thClass;

public class Main {
    public static void main(String[] args) {

/*        MathCal math = new MathCal();
        math.sum(6,5);
        math.sum(3,6,1222);*/

        StringConcatination example = new StringConcatination();
        StringConcatination example1= new StringConcatination("Soham");
        StringConcatination example2= new StringConcatination("Soham", "Amritbhai");
        StringConcatination example3= new StringConcatination("Soham","Amrtibhai","Chaudhary");
        StringConcatination example4= new StringConcatination("Soham","Amrtibhai","Chaudhary", 24);

        example.displayName("Gwen");
        example.displayName("Gwen","Stacy");
        example.displayName("Gwen","Stacy","Gray");
        example.displayName("Gwen",24);

        example1.displayName(example1.firstName);

        example2.displayName(example2.firstName);
        example2.displayName(example2.firstName,example2.middleName);

        example3.displayName(example3.firstName);
        example3.displayName(example3.firstName,example3.middleName);
        example3.displayName(example3.firstName,example3.middleName,example3.lastName);

        example4.displayName(example4.firstName);
        example4.displayName(example4.firstName,example4.middleName);
        example4.displayName(example4.firstName,example4.middleName,example4.lastName);
        example4.displayName(example4.firstName,example4.age);

    }
}
