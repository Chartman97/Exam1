import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int all = 0;
        int input;
        System.out.println("I will find the sum of the numbers you input.");
        System.out.println("Input as many numbers as you would like.\nThen input 0 to add em all up!");

        while (true){
            System.out.print("Enter Here->");
            input = in.nextInt();
            if (input == 0) {
                break;
            }
            all += input;
        }
        System.out.printf("Boom " + all);
    }
}
