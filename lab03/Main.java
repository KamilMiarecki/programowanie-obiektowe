import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
    }



    public static void zad1(){

        int suma = 0, srednia;
        int suma2 = 0; int srednia2;
        int []liczby=new int[5];
            Random r = new Random();
        for (int i = 0; i <5 ; i++) {
        int  a=  r.nextInt(20);
            System.out.println(a);
            suma+=a;

        }
        srednia = suma / liczby.length;
        System.out.println("suma= "+suma+ ", srednia : "+ srednia);

        System.out.println("for each");
        for (int i:liczby) {
            int  b=  r.nextInt(20);
            System.out.println(b);
             suma2+=b;

        }
        srednia2 = suma2 / liczby.length;
        System.out.println("suma= "+suma2+ ", srednia : "+ srednia2);



    }




    public static void zad2(){
        int []tablica1={ 1,2,3,4};
        int []tablica2={ 1,2,3,4,5};
        for (int i = 0; i < tablica1.length; i+=2)
        {
            System.out.println(tablica1[i]);

        }
        for (int i = 0; i < tablica2.length; i+=2) {
            System.out.println(tablica2[i]);
        }
    }
    public static void zad3() {
        String[]slowa={"ala","ma", "kota"};
        for (String slowo:slowa) {
            System.out.println(slowo.toUpperCase());
    }
    }
        public static void zad4() {
        String[]slowa=new String[5];
        System.out.println("podaj "+slowa.length+"slow: ");
            for (int i = 0; i < slowa.length; i++) {
                System.out.println((i+1) +" slowo: ");
               slowa[i] = getString();
            }

            for (int i = slowa.length-1; i >=0 ; i--) {
                for (int j = slowa[i].length()-1; j >=0 ; j--) {
                    System.out.println(slowa[i].charAt(j));
                }
                System.out.println();
            }
        }
    public static String getString() {
        return new Scanner(System.in).next();
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static void zad5() {

        int[]tab=new int[8];
        System.out.println("podaj "+tab.length+"liczb: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println((i+1) +" liczba : ");
            tab[i] = getInt();
        }
        for (int i = 1; i < tab.length ; i++) {
         int liczba=tab[i];
         int j=i-1;
         while (j>=0&&tab[j]>liczba) {
             tab[j+1]=tab[j];
             j--;
         }
         tab[j+1]=liczba;
        }
        System.out.println("posortowane liczby rosnaco :");
        for (int i:tab) {
            System.out.println(i+", ");

        }
    }
    public static void zad6(){
        int[]tabsilnia=new int[5];
        System.out.println("podaj "+tabsilnia.length+"liczb: ");
        for (int i = 0; i < tabsilnia.length; i++) {
            System.out.println((i+1) +" liczba : ");
            tabsilnia[i] = getInt();
        }
        for(int a:tabsilnia) {
            if(a<0){
                System.out.println("nie liczy sie silni dla liczb ujemnych");
            }
            else{
                int silnia=1;
                for (int i = 1; i <=a ; i++) {
                    silnia*=i;
                }
                System.out.println("silnia liczby  "+a+ " : " +silnia);
            }
        }

    }
    public static void zad7(){
        String[]tab1={"a","b","c","d"};
        String[]tab2={"a","b","c","d"};
        boolean roznica=false;
        if(tab1.length!=tab2.length){
            roznica=true;
        }else{
            for(int i=0; i<tab1.length; i++){
                if(!tab1.equals(tab2));
                roznica=true;
                break;
            }
        }
        if(roznica=true){
        System.out.println("tablice sa takie same");
        }
        else {
            System.out.println("tablice  nie sa takie same");
        }
    }

}
