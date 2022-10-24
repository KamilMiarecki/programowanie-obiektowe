import java.util.Scanner;



import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
         zadanie1();
         zadanie2();
         zadanie3();
        // zad4();
        lab2zad1();
        lab2zad2a();
        lab2zad2b();
        lab2zad2c();
        lab2zad3();
        lab2zad4();
        lab2zad5();
        lab2zad6();


    }



    //zad1
    public static void zadanie1(){


        int n;
        double suma=0;
        double pkt, ile=0;
        Scanner input=new Scanner(System.in);

        System.out.println("podaj liczbe studentow : ");
        n= input.nextInt();
        if(n>0){
            while (n>0){
                System.out.println("podaj ilosc punktow 0-10");
                pkt= input.nextDouble();
                if(pkt>=0&& pkt<=10){
                    suma+=pkt;
                    ile++;
                    n--;
                }

            }
            System.out.println("suma pkt: "+suma);
            System.out.println("suma pkt: "+(suma/ile));
        }
        System.out.println("studenci >0 ");

    }

    //zad2
    public static void zadanie2() {
        int n=10;
        int ile_dodatnich=0;
        int ile_ujemnych=0;
        double sumaDodatnich=0;
        double sumaUjemnych=0;
        double liczba;

        for (int i = 0; i < n; i++) {
            liczba=input();
            if(liczba>=0)
            {
                ile_dodatnich++;sumaDodatnich+=liczba;
            }
            else ile_ujemnych++;sumaUjemnych+=liczba;
        }
        System.out.println("ilosc dodatnich: "+ile_dodatnich+" suma = "+sumaDodatnich);
        System.out.println("ilosc ujemnych: "+ile_ujemnych+" suma = "+sumaUjemnych);

    }
    public static double input(){
        Scanner input = new Scanner (System.in);
        System.out.println("podaj liczbe: ");
        return input.nextDouble();
    }

    public static void zadanie3() {
        System.out.println("ile liczb w ciagu: ");
        double n = input();
        int parzyste = 0;
        int nieparzyste=0;
        double liczba;
        double sumaParzystych = 0;
        double sumaNieparzystych = 0;


        for (int i = 0; i < n; i++) {
            liczba=input();
            if(liczba%2==0)
            {
                parzyste++;sumaParzystych+=liczba;
            }
            else nieparzyste++;sumaNieparzystych+=liczba;
        }
        System.out.println("ilosc parzystych: "+parzyste+" suma = "+sumaParzystych);
        System.out.println("ilosc nieparzystych: "+nieparzyste+" suma = "+sumaNieparzystych);


    }
   // public static boolean zad4(String s){
    //    int l=s.length()-1;
    //    s.toLowerCase(Locale.ROOT);
    //    for (int i = 0; i <s.length() /2; i++) {
    //        if(s.charAt(i)!=s.charAt(l))return false;
     //     l--;
    //}
     // return true;
    //}

    //zad1 lab2
    public static void lab2zad1(){
        Scanner in=new Scanner(System.in);
        System.out.println(" podaj dane a b c :");
        double a,b,x,c,x1,x2;
        double delta;
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();

        delta=b * b - 4 * a * c ;
        System.out.println("delta: " + delta);
        if(delta>0)
        {

            x1=(-b-sqrt(delta)/(2*a));
            x2=(-b+sqrt(delta)/(2*a));
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
        else
            if (delta==0){

            x=-b/(2*a);
            System.out.println("x: " + x);
        }

        else  System.out.println("rownanie nie ma x");


    }

    public static void lab2zad2a() {
        Scanner in = new Scanner(System.in);
        System.out.println(" podaj x");
        double x;
        x=in.nextDouble();

        if (x>0) {
            System.out.println((2*x));
        }
        else if (x==0) {
            System.out.println(+0);
        }
        else
        System.out.println(((-3)*x));



    }

    public static void lab2zad2b() {
        Scanner in = new Scanner(System.in);
        System.out.println(" podaj x");
        double x;
        x=in.nextDouble();

        if (x>=1){
            System.out.println((x*x));

        }
        else {
            System.out.println(+x);
        }

    }
    public static void lab2zad2c() {
        Scanner in = new Scanner(System.in);
        System.out.println(" podaj x");
        double x;
        x=in.nextDouble();

        if (x>2) {
            System.out.println((2+x));
        }
        else if (x==2){
            System.out.println(+8);
        }
        else {
            System.out.println((x-4));

        }
    }

    public static void lab2zad3() {
        Scanner in = new Scanner(System.in);
        System.out.println(" podaj x,y,z");
        double x,y,z;
        x=in.nextDouble();
        y=in.nextDouble();
        z=in.nextDouble();

        if(x<y && y<z) {
            System.out.println(x + ", " + y + ", " + z);
        }
        else if(z < y && x > y) {
            System.out.println(z+", "+y+", "+x);
        }
        else if(x>z&&z<y&&x<y) {
            System.out.println(z+", "+x+", "+y);
        }
        else if (y<x&&y<z&&x<z) {
            System.out.println(y+", "+x+", "+z);
        }
        else if (y < z && x > z) {
            System.out.println(y+", "+z+", "+x);
        }
        else if (z < y && x < z) {
            System.out.println(x+", "+z+", "+y);
        }
    }
    public static void lab2zad4(){
        Scanner in = new Scanner(System.in);
        System.out.println(" podaj informacje: 1.pada deszcz? (1=tak,0=nie) 2.jest autobus na przystanku? (1=tak, 0=nie)");
        double pada_deszcz, autobus_na_przystanku;
        pada_deszcz=in.nextDouble();
        autobus_na_przystanku=in.nextDouble();
        if (pada_deszcz==1&&autobus_na_przystanku==1) {
            System.out.println("Wez parasol, dostaniesz sie na uczelnie");
        }
            else if (pada_deszcz==1&&autobus_na_przystanku==0){
            System.out.println("nie dostaniesz sie na uczelnie");
            }
        else if (pada_deszcz!=1&&autobus_na_przystanku==1) {
            System.out.println("Dostaniesz sie na uczelnie, milego dnia i pieknej pogody");
        }
    }

    public static void lab2zad5(){
        Scanner in = new Scanner(System.in);
        System.out.println(" podaj informacje: 1.znizka na samochod? (1=tak,0=nie) 2.otrzymales premie? (1=tak, 0=nie)");
        double znizka, premia;
        znizka=in.nextDouble();
        premia=in.nextDouble();
        if (znizka!=1||premia==1) {
            System.out.println("mozesz kupic samochod, znizki na samochod nie ma");

        }
       if (znizka!=1||premia!=1) {
            System.out.println("zakup samochodu trzeba odlozyc na pozniej , znizki na samochod nie ma");
        }
       if (znizka!=0||premia==1) {
            System.out.println("mozesz kupic samochod");
        }
    }



    public static void lab2zad6(){
        Scanner in = new Scanner(System.in);
        System.out.println("podaj 2 liczby: ");
        double liczba1,liczba2;
        char znak;
        liczba1=in.nextDouble();
        liczba2=in.nextDouble();
        System.out.println("wybierz 1 z ponizej podanych programow :");
        System.out.println("dodawanie wcisnij + :");
        System.out.println("odejmowanie wcisnij - :");
        System.out.println("mnozenie wcisnij * :");
        System.out.println("dzielenie wcisnij / :");
        System.out.println("reszta z dzielenia wcisnij %:");
        znak=in.next().charAt(0);
        switch(znak){
            case '+':
            {
                System.out.println(liczba1+ "+ " +liczba2+"= " +(liczba1+liczba2));
                break;
            }
            case '-':
            {
                System.out.println(liczba1+ "- " +liczba2+"= " +(liczba1-liczba2));
                break;
            }
            case'*':
            {
                System.out.println(liczba1+ "* "+liczba2+ "= " +(liczba1*liczba2));
                break;
            }
            case '/':
            {
                if (liczba1 != 0 || liczba2 != 0) {
                    System.out.println(liczba1 + "/ " + liczba2 + "= " + (liczba1 / liczba2));
                } else {
                    System.out.println("nie dziel przez 0");
                }
                break;
            }
            case '%':
            {
                if (liczba1 != 0 || liczba2 != 0) {
                    System.out.println(liczba1 + "% " + liczba2 + "= " + liczba1 % liczba2);
                } else System.out.println("nie dziel przez 0");
            }
        }
    }



}

