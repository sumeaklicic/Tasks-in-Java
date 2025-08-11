
package motornavozila;

public class Motor extends Vozilo {
    
    private boolean natkriven;

    public Motor(boolean natkriven, int kubikaza, String boja, int registracija) {
        super(kubikaza, boja, registracija);
        this.natkriven = natkriven;
    }

    public void setNatkriven(boolean natkriven) {
        this.natkriven = natkriven;
    }

    @Override
    public String toString() {
        return super.toString() + " da li je natkriven "+ natkriven;
    }
    
}
