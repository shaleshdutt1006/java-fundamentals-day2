import java.util.Scanner;

public class SumNaturalNumberForLoop {


    public static void main(String[] args) {

        int sum = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter number you want to check ");
        int number = num.nextInt();
        for (int i = 0; i <= number; i++) {

            sum = sum + i;
        }
        System.out.println(sum);

    }
}