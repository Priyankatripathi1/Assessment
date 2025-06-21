import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        double i = scanner.nextDouble();
        if (i > 0) {
            System.out.println("Positive Number");
        } else if (i < 0) {
            System.out.println("Negative Number");
        } else if (i == 0) {
            System.out.println("Zero Number");
        }
    }
}