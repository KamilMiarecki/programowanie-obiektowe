import java.util.Objects;

public class Uczestnik {
    int id;
    String imie;
    int wiek;

    public Uczestnik(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Uczestnik" + "id=" + id + ", imie='" + imie + ", wiek=" + wiek ;
    }

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return id == uczestnik.id && wiek == uczestnik.wiek && imie.equals(uczestnik.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, wiek);
    }
}

