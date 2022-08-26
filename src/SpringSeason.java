import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {


        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (month == 3 && day > 20) {
            System.out.println("True");
        } else if (month == 4 && day <= 30) {
            System.out.println("True");
        } else if (month == 5 && day <= 31) {
            System.out.println("True");
        } else if (month == 6 && day < 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
