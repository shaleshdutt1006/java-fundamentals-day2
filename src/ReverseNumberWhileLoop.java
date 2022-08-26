import java.time.Clock;
import java.util.Scanner;

public class ReverseNumberWhileLoop {

    public static void main(String[] args) {
        int reverse = 0, rem;
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter number you want to reverse");
        int number = num.nextInt();
        while (number != 0) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;


        }
        System.out.println("Reverse number of your entered number is : " + reverse);
    }
}
