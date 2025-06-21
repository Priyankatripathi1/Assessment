public class test01 {
    int i;
    byte b;
    long l;
    float f;
    double d;
    short s;
    char ch;
    boolean bl;

    public static void main(String[] args) {
        test01 def = new test01();

        System.out.println("Default value of int: " + def.i);
        System.out.println("Default value of byte : " + def.b);
        System.out.println("Default value of long : " + def.l);
        System.out.println("Default value of float: " + def.f);
        System.out.println("Default value of double: " + def.d);
        System.out.println("Default value of short: " + def.s);
        System.out.println("Default value of char: '" + def.ch);
        System.out.println("Default value of boolean: " + def.bl);


    }
}
