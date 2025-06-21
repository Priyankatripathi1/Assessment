import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + "X" + i + "=" + result);
        }
    }
}