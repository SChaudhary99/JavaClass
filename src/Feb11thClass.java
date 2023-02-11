import java.util.Scanner;
import static javafx.application.Platform.exit;
/*
* Auth: Soham Chaudhary
* Date: 11th Feb 2023
* Example of using loops and methods for simple arithmetic operations.(+,-,*,/,%)
*/

public class Feb11thClass {

    public static void main(String[]args) throws InterruptedException {
        int input;
        do {
            Thread.sleep(2000);
            System.out.println("------------------------------------------------------------\n"+
                    "1. Please get the Addition.\n" +
                    "2. Please get the Subtraction.\n" +
                    "3. Please get the Multiplication.\n" +
                    "4. Please get the Division.\n" +
                    "5. Please get the Modulo.\n" +
                    "0. Exit.\n"+"------------------------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the Selection: ");
            input = scanner.nextInt();
            if (input == 0) {
                exit();
            } else if(input >5 || input<0){
                System.err.println("Invalid Input! Try Again.");
            }
            else{

                System.out.print("Please enter the number one: ");
                int num1 = scanner.nextInt();
                System.out.print("Please enter the number two: ");
                int num2 = scanner.nextInt();

                switch (input) {

                    case 1:
                        sum(num1, num2);
                        break;
                    case 2:
                        sub(num1, num2);
                        break;
                    case 3:
                        multi(num1, num2);
                        break;
                    case 4:
                        div(num1, num2);
                        break;
                    case 5:
                        mod(num1, num2);
                        break;
                }
            }

        } while (input != 0);
    }

    public static void sum(int num1, int num2){
        System.out.println("The Addition of entered numbers is: " + (num1+num2) );
    }
    public static void sub(int num1, int num2){
        System.out.println("The Subtraction of entered numbers is: " + (num1-num2) );
    }
    public static void multi(int num1, int num2){
        System.out.println("The Multiplication of entered numbers is: " + (num1*num2) );
    }
    public static void div(int num1, int num2){
        System.out.println("The Division of entered numbers is: " + (num1/num2) );
    }
    public static void mod(int num1, int num2){
        System.out.println("The Modulo of entered numbers is: " + (num1 % num2) );
    }

}
