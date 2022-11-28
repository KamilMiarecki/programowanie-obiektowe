import java.time.LocalDate;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        Prostokat p1=new Prostokat(2,2);
        p1.Wypisz();

       Budynek b1=new Budynek("dssdasad", LocalDate.of(2001, 10, 10),100);
        b1.getIleLat();

        Gatunek g1=new Gatunek ("aaa","bbb",23,46);
        g1.Wypisz();
    }
}
