import java.util.Scanner;

public class Distance {


    public static void main(String[] args) {
        float distance;


        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        distance = (float) Math.sqrt(x * x + y * y);
        System.out.println("Distance from the origin is " + distance);

    }
}
