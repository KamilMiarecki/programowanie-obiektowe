import java.util.SortedMap;


class Prostokat {
    double dlugosc, szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;

    }
    public double Pole(){
        return dlugosc*szerokosc;
    }
    public double Obwod(){
        return (2*dlugosc)+(2*szerokosc);
    }
    public double Przekatna(){
        return Math.sqrt(((Math.pow(dlugosc,2))+Math.pow(szerokosc,2)));
    }
    public void Wypisz(){
        System.out.println("prostokat o boku a:" +dlugosc+" i boku b: "+szerokosc);
        System.out.println("Pole wynosi: "+Pole());
        System.out.println("Obwod wynosi: "+Obwod());
        System.out.println("przekatna wynosi: "+Przekatna());
    }

}