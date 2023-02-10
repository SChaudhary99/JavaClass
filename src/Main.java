
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas enter the first value : ");
        num1 = scanner.nextInt();
        System.out.println("Please enter the second value : ");
        num2 = scanner.nextInt();
        // arithmetic operation

        int sum = num1 + num2;

        System.out.print("Sum is : "+sum);


    }
}