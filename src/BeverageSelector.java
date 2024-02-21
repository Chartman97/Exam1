import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please Enter A Number Between 1-3 Here ->");
        int number = in.nextInt();

        if (number == 1) {
            System.out.println("Water");
        } else if (number == 2) {
            System.out.println("Coke");
        } else if (number == 3) {
            System.out.println("Coffee");
        }
    }
}
