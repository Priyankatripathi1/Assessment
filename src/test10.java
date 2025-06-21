import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        double i = scanner.nextDouble();
        System.out.println("Enter 2nd number");
        double j = scanner.nextDouble();
        System.out.println("Choose between +,-,*,/");
        char operator= scanner.next().charAt(0);

        double result;

        switch (operator){
            case '+': result= i+j;
                System.out.println("Result: "+ result );
                break;
            case '-': result = i-j;
                System.out.println("Result: "+ result );
                break;
            case '*': result= i*j;
                System.out.println("Result: "+ result );
                break;
            case '/':
                if(j != 0)
            { result = i / j;
                System.out.println("Result: " + result);
            }
                else
            {
                System.out.println("Number cannot be divided by 0");
            }
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}