import java.util.Scanner;

public class PalindromeNumber {


    public static void main(String[] args) {

        int reverse = 0, rem;
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter number you want to check ");
        int number = num.nextInt();
        int temp = number;
        for (; temp != 0; ) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;


        }

        if (reverse == number) {
            System.out.println("Your entered number is palindrome");
        } else {
            System.out.println("Your entered number is not palindrome");
        }

    }
}
