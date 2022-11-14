public class Gatunek {
    String nazwa;
    String nazwa_gatunku;
    double liczba_chromosomow2n;
    double podstawowa_liczba_chromosomowx;

    public Gatunek(String nazwa,String nazwa_gatunku,double podstawowa_liczba_chromosomowx, double liczba_chromosomow2n) {
        this.nazwa = nazwa;
        this.nazwa_gatunku =nazwa_gatunku;
        this.podstawowa_liczba_chromosomowx =podstawowa_liczba_chromosomowx;
        this.liczba_chromosomow2n = liczba_chromosomow2n;

    }

    public String pelna_nazwa(){
        this.nazwa=nazwa;
        this.nazwa_gatunku=nazwa_gatunku;
        return nazwa+nazwa_gatunku;
    }

    public double haploidalnanazwa(){
        podstawowa_liczba_chromosomowx= liczba_chromosomow2n/2;
        System.out.println("podstawowa_liczba_chromosomowx: ");
        return  podstawowa_liczba_chromosomowx;
    }
    public void Wypisz(){
        System.out.println(pelna_nazwa());
        System.out.println(haploidalnanazwa());
        System.out.println("liczba_chromosomow 2n: "+liczba_chromosomow2n);

    }
}