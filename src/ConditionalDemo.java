import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Marks of English: ");
        double num1=scanner.nextDouble();
        System.out.println("Please enter Marks of Math: ");
        double num2=scanner.nextDouble();

        //adding both subjects marks
        double total= num1+num2;

        if(total<40) {
            System.out.println("You are failed!");
        }

        else if (40 <= total && total <= 60 ){
            System.out.println("You are good!");

        }
        else if (60 < total && total <= 70 ){
            System.out.println("You are very good!");
        }
        else if (70 < total && total <= 80 ){
            System.out.println("You are Excellent!");

        }
        else {
            System.out.println("You are a Champion!!!!!!");
        }



    }
}
