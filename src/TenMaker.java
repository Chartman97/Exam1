import java.util.Scanner;

public class TenMaker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.print("Enter One Number Here ->");
        int number1 = in.nextInt();
        System.out.print("Very Good. Now Enter Another Number Here ->");
        int number2 = in.nextInt();
        double num = makes10(number1, number2);

        if (num == 10) {
            System.out.println("That Equals 10!");
        } else System.out.println("Does not Equal 10...");
    }

    public static double makes10(int number1, int number2) {
        return number1 + number2;
    }
}

