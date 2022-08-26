import java.util.Scanner;

public class SumNaturalNumbersWhileLoop {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter number you want to check");
        int number = num.nextInt();
        while (i <= number) {
            sum = sum + i;
            i++;


        }
        System.out.println("sum of natural number is " + sum);

    }
}
