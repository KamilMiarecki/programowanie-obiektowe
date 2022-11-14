import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    LocalDate rok_budowy;
    int liczba_pieter;



    public Budynek(String nazwa, LocalDate rok_budowy, int liczba_pieter) {
        this.nazwa = nazwa;
        this.rok_budowy = rok_budowy;
        this.liczba_pieter = liczba_pieter;
    }
    public void setNazwa(String nazwa) { this.nazwa=nazwa; }

    public long getIleLat(){
        LocalDate today=LocalDate.now();
        long ileLat= ChronoUnit.YEARS.between(rok_budowy,today);
        System.out.println(ileLat) ;
        return ileLat;

    }

}