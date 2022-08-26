import java.util.Scanner;

public class NumberInWords {
    static void Check(int number) {
        if (number == 0) {
            System.out.println("Number in words is zero");
        } else if (number == 1) {
            System.out.println("Number in words is one");
        } else if (number == 2) {
            System.out.println("Number in words is two");
        } else if (number == 3) {
            System.out.println("Number in words is three");
        } else if (number == 4) {
            System.out.println("Number in words is four");
        } else if (number == 5) {
            System.out.println("Number in words is five");
        } else if (number == 6) {
            System.out.println("Number in words is Six");
        } else if (number == 7) {
            System.out.println("Number in words is Seven");
        } else if (number == 8) {
            System.out.println("Number in words is Eight");
        } else if (number == 9) {
            System.out.println("Number in words is Nine");
        }
    }

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Please enter number you want to check in words");
        int number = num.nextInt();
        Check(number);


    }

}


