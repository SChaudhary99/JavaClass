package Feb14thClass;
/**
 * @author sohamchaudhary
 * */

public class Feb14th {
    public static void main (String[]args){
        Human [] newHuman = new Human[8];                   //Initializing 8 new Objects of Human class using array

        //ignore [] right now this is not covered yet in class,

        newHuman[0] = new Human("Tom Hank",20,'m', true, true );
        newHuman[1] = new Human("Alex Brown",70,'m', false, true );
        newHuman[2] = new Human("Britni Biden",34,'f', true, false );
        newHuman[3] = new Human("Khalissi",29,'f', true, true );
        newHuman[4] = new Human("Naruto Uzumaki",16,'m', true, true );
        newHuman[5] = new Human("Edward Kenway",37,'m', true, true );
        newHuman[6] = new Human("Stacy Brew",90,'f', false, false );
        newHuman[7] = new Human("Tanjiro Kamado",18,'m', true, true );


        System.out.println("\n------------Vision Test---------------\n");
        for (int x =0; x<8; x++ ){
            newHuman[x].see();         //Calling the see() method for each human to check if they can see or not
        }

        System.out.println("\n------------Vocal Test---------------\n");
        for (int y =0; y<8; y++ ){
            newHuman[y].speak();            //Calling the speak() method for each human to check if they can speak or not
        }

        System.out.println("\n------------Age Separation---------------\n");
        for (int j=0; j<8; j++){
            newHuman[j].ageSepration();           //calling ageSepration() method to see who is teen, adult or senior.
        }

    }

}
