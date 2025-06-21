public class test05 {
    public static void main(String[] args) {

        int a = 6, b = 5;
        int x = 2, y = 3;

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\n=== Logical Operators ===");
        System.out.println("(a > b) && (x > y): " + ((a > b) && (x > y)));
        System.out.println("(a > b) || (x < y): " + ((a > b) || (x < y)));
        System.out.println("!(a == b): " + !(a == b));


        System.out.println("\n=== Bitwise Operators ===");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));

        System.out.println("\n=== Assignment Operators ===");
        int num = 20;
        System.out.println("Initial num: " + num);
        num += 5; // num = num + 5
        System.out.println("After num += 5: " + num);
        num -= 2; // num = num - 2
        System.out.println("After num -= 2: " + num);
        num *= 3; // num = num * 3
        System.out.println("After num *= 3: " + num);
        num /= 4; // num = num / 4
        System.out.println("After num /= 4: " + num);
        num %= 3; // num = num % 3
        System.out.println("After num %= 3: " + num);


        System.out.println("\n=== Unary Operators ===");
        int val = 5;
        System.out.println("val = " + val);
        System.out.println("++val = " + (++val));
        System.out.println("--val = " + (--val));
        System.out.println("val++ = " + (val++));
        System.out.println("val-- = " + (val--));
        System.out.println("Final val = " + val);


        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
    }
}
