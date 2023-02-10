import java.util.Scanner;

public class SwitchCase {

    public static void main(String[]args){

        System.out.println("---------------IVR--------------");
        System.out.println("A. for English");
        System.out.println("B. for Gujarati");
        System.out.println("C. for French");
        System.out.println("D. for Spanish");
        System.out.println("E. Exit the code");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the user input : ");
        char input= scanner.next().charAt(0);

        switch (input){
            case 'A':
                System.out.println("You have selected English!");
                break;

            case 'B':
                System.out.println("You have selected Hindi!");
                break;

            case 'C':
                System.out.println("You have selected French!");
                break;

            case 'D':
                System.out.println("You have selected Spanish!");
                break;

            case 'E':
                System.out.println("You have exited the code");
                break;

            default:
                System.out.println("You have entered wrong value"+"\n"+"Please try again");

        }

    }
}
