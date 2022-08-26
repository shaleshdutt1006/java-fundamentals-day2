import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Please enter value of a");
        int a = num.nextInt();
        System.out.println("Please enter value of b");
        int b = num.nextInt();
        System.out.println("Please enter value of c");
        int c = num.nextInt();
        int first = a + b * c;
        int second = c + a / b;
        int third = a % b + c;
        int fourth = a * b + c;
        int number = Math.max(Math.max(first, second), Math.max(third, fourth));
        if (number == first) {
            System.out.println("First equation has maximum value");
        } else if (number == second) {
            System.out.println("Second equation has maximum value");
        } else if (number == third) {
            System.out.println("third equation has maximum value");
        } else if (number == fourth) {
            System.out.println("Fourth equation has maximum value");
        }
        int number2 = Math.min(Math.min(first, second), Math.min(third, fourth));
        if (number2 == first) {
            System.out.println("First equation has minimum value");
        } else if (number2 == second) {
            System.out.println("Second equation has minimum value");
        } else if (number2 == third) {
            System.out.println("third equation has minimum value");
        } else if (number2 == fourth) {
            System.out.println("Fourth equation has minimum value");
        }


    }

}
