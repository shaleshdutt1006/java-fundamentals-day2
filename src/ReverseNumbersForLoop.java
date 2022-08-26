import java.util.Scanner;

public class ReverseNumbersForLoop {
    public static void main(String[] args) {


        int reverse = 0, rem;
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter number you want to check ");
        int number = num.nextInt();


        for (int i = 0; number > 0; i++) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;


        }
        System.out.println("Your reverse number is : " + reverse);
    }
}