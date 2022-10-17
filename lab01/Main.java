import java.util.Scanner;


//import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;

public class Main {
    public static void main(String[] args) {
        //wywolanie metod
        //zad1
        System.out.println("zad1");
        System.out.println(getMyName());
        System.out.println(getMyAge());


        //zad2
        System.out.println("zad2");
        Scanner in2 = new Scanner(System.in);
        int a, b;
        System.out.println("podaj a i b: ");
        a = in2.nextInt();
        b = in2.nextInt();
        obliczenia(a, b);

        //zad3
        System.out.println("zad3");
        Scanner in3 = new Scanner(System.in);
        int d;
        System.out.println("podaj d: ");
        d = in3.nextInt();
        System.out.println(parzystosc(d));

        //zad4
        System.out.println("zad4");
        Scanner in4 = new Scanner(System.in);
        int c;
        System.out.println("podaj c:");
        c= in4.nextInt();
        System.out.println(zad4(c));

        //zad5
        System.out.println("zad5");
        Scanner in5 = new Scanner(System.in);
        int e;
        System.out.println("podaj e:");
        e= in5.nextInt();
        potegowanie(e);

        //zad6
        System.out.println("zad6");
        Scanner in6 = new Scanner(System.in);
        int f;
        System.out.println("podaj f:");
        f= in6.nextInt();
        pierwiastek(f);

        //zad7
        System.out.println("zad7");
        Scanner in7 = new Scanner(System.in);
        int x,y,z;
        System.out.println("podaj x y z:");
        x= in7.nextInt();
        y= in7.nextInt();
        z= in7.nextInt();
        System.out.println(trojkat(x,y,z));
    }

    //metody
    public static String getMyName() {
        return "Jan";
    }

    public static int getMyAge() {
        return 23;

    }

    public static void obliczenia(int l1, int l2) {
        System.out.println(l1 + "+" + l2 + "= " + (l1 + l2));
        System.out.println(l1 + "-" + l2 + "= " + (l1 - l2));
        System.out.println(l1 + "*" + l2 + "= " + (l1 * l2));
    }

    public static boolean parzystosc(int d) {
        return d % 2 == 0;
    }
    public static boolean zad4(int c ){
        return c % 3 == 0 && c % 5 == 0;
    }
    public static void potegowanie(int e) {
        System.out.println(e + "^" + "3" + "= " + (e*e*e));
    }
    public static void pierwiastek(int f) {
        System.out.println("pierwiastek z f wynosi  " + f + "= " + Math.sqrt(f));
    }
    public static boolean trojkat(int x, int y, int z){
        if(x*x+y*y==z*z) return true;
        else if(x*x+z*z==y*y) return true;
       else return y * y + z * z == x * x;
}



}
