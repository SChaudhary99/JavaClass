package Feb14thClass;
/**
 * @author sohamchaudhary
 * */

public class Feb14th {
    public static void main (String[]args){
        Human [] newHuman = new Human[8];                   //Initializing 8 new Objects of Human class using array


        newHuman[0] = new Human("Tom Hank",20,'m', true, true );
        newHuman[1] = new Human("Alex Brown",70,'m', false, true );
        newHuman[2] = new Human("Britni Biden",34,'f', true, false );
        newHuman[3] = new Human("Khalissi",29,'f', true, true );
        newHuman[4] = new Human("Naruto Uzumaki",16,'m', true, true );
        newHuman[5] = new Human("Edward Kenway",37,'m', true, true );
        newHuman[6] = new Human("Stacy Brew",90,'f', false, false );
        newHuman[7] = new Human("Tanjiro Kamado",18,'m', true, true );

        int x;
        System.out.println("\n------------Vision Test---------------\n");
        for (x =0; x<8; x++ ){
            newHuman[x].see();         //Calling the see() method for each human to check if they can see or not
        }

        System.out.println("\n------------Vocal Test---------------\n");
        for (x =0; x<8; x++ ){
            newHuman[x].speak();            //Calling the speak() method for each human to check if they can speak or not
        }

        System.out.println("\n------------Age Separation---------------\n");
        for (x=0; x<8; x++){
            newHuman[x].ageSepration();           //calling ageSepration() method to see who is teen, adult or senior.
        }

    }

}
