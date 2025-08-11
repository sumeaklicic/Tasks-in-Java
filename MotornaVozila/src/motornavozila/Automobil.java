
package motornavozila;

public class Automobil extends Vozilo {
    
    private boolean kabriolet;
    
    public Automobil(int kubikaza, String boja, int regOznaka, boolean kab)
    {
        super(kubikaza, boja, regOznaka);
        kabriolet=kab;
    }

    public void setKabriolet(boolean kabriolet) {
        this.kabriolet = kabriolet;
    }

    @Override
    public String toString() {
        return super.toString() + "kabriotel "+ kabriolet;
    }
}
