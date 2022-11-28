
public class Main {

}
interface Plywa {
    public void plyn();
}
interface Lata {
    public void lec();
}
class Statek implements Plywa {
    public void plyn(){
        System.out.println ("Statek plynie");
    }
}
class Samolot implements Lata {
    public void lec(){
        System.out.println ("Samolot leci");
    }
}


interface Plywanie{
    public void plyn();
    public void wynurz();
    public void zanurz();

}
interface Latanie{
    public void leci();
    public void wyladuj();
}

class Ryba implements Plywanie{
        public void plyn(){
            System.out.println("ryba plynie");
        }
        public void wynurz(){
            System.out.println("ryba sie wynurza");
        }
        public void zanurz(){
            System.out.println("ryba sie zanurza");
        }
        public void jedz(){
            System.out.println("ryba je");
        }
        public void wydalaj(){
            System.out.println("ryba wydala");
        }

}


