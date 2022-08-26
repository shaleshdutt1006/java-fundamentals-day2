import java.util.Scanner;

public class VowelAndConsonants {
    public static void main(String[] args) {
        Boolean Isvowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number you want to check ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                Isvowel = true;
        }
        if (Isvowel == true) {
            System.out.println("Entered letter is vowel");
        } else {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println("Entered character is Consonant");
            } else {
                System.out.println("Entered input is not a character");
            }

        }

    }
}
