import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        for(int i=1; i<=number; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.println( "$ " );
            }
        }
        System.out.println();
    }
}