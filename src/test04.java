public class test04 {
    public static void main(String[] args) {


        System.out.println("Implicit Type Casting:");

        int i = 100;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("int value: " + i);
        System.out.println("long value : " + l);
        System.out.println("float value : " + f);
        System.out.println("double value : " + d);



        System.out.println("\nExplicit Type Casting:");

        double db = 99.99;
        float fl = (float) db;
        long lg = (long) fl;
        int in = (int) lg;
        short st = (short) in;
        byte by = (byte) st;

        System.out.println("double value: " + db);
        System.out.println("float value : " + fl);
        System.out.println("long value : " + lg);
        System.out.println("int value : " + in);
        System.out.println("short value : " + st);
        System.out.println("byte value : " + by);
    }
}
