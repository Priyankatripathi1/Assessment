import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int fact=1;
        int i=1;
        while (i<=number)
        {
            fact = i* fact;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + fact );
    }
}
