import java.util.Scanner;

public class PlaceValues {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Please enter number you want to check Place values");
        int number = num.nextInt();
        int thousand = number / 1000;
        int hundred = number % 1000 / 100;
        int tens = number % 100 / 10;
        int unit = number % 10;
        System.out.println("place value of thousand is : " + thousand);
        System.out.println("place value of hundred is : " + hundred);
        System.out.println("place value of tens is : " + tens);
        System.out.println("place value of unit is : " + unit);


    }


}


