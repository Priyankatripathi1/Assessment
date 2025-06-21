import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int i= scanner.nextInt();
        System.out.println("Enter 2nd number");
        int j=scanner.nextInt();
        System.out.println("Enter 3rd number");
        int k = scanner.nextInt();
        if (i >= j  &&  i>=k) {
            System.out.println("Greatest Number is= " + i);
        } else if(j>=i && j>=k)
        {
            System.out.println("Greatest Number is= " + j);
        } else if (k>=i && k>=j)
        {

            System.out.println("Greatest Number is= " + k);
        }
        System.out.println();
    }
}