package Feb14thClass;
/**
 * @author sohamchaudhary
 * */
//typical class blueprint
public class Human {
    String name;
    int age;
    char sex;
    boolean vision;
    boolean vocals;


    // attributes --> instances variables

    //constructors --> are not method but looks like methods | cannot be static
    //behaviors --> Basically methods(in this case being able to see, being able to speak and age separation)

    //if we do not write constructor then java will write a default constructor. in this case i have written constructor.


    //in my constructor i have passed 5 parameters, which i will use to create 8 people in Feb14th.java class
    public Human(String name, int age, char sex, boolean vision, boolean vocals){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.vision=vision;
        this.vocals=vocals;

    }

    public void speak(){
        if (vocals==true){
            System.out.println(name+ ", Age : "+age+", Sex : "+sex+", Can speak clearly");
        }
        else
            System.out.println(name+ ", Age : "+age+", Sex : "+sex+", Cannot speak clearly");
    }
    public void see(){
        if (vision==true){
            System.out.println(name+ ", Age : "+age+", Sex : "+sex+", Can see clearly");

        }
        else
            System.out.println(name+ ", Age : "+age+", Sex : "+sex+", Cannot see clearly");
    }

    public void ageSepration(){
        if(age<=18){
            System.out.println(name+" is Teenager. " );
        }
        else if (age>18 && age<62){
            System.out.println(name+" is Adult. " );

        }
        else {
            System.out.println(name+" is Senior." );
        }
    }

}
