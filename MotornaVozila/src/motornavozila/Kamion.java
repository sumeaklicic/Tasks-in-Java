
package motornavozila;

public class Kamion extends Vozilo{
    
    private int maxNosivost;
    
    Kamion(int kubikaza, String boja, int registracija, int mn)
    {
        super(kubikaza, boja, registracija);
        maxNosivost=mn;
    }

    public void setMaxNosivnost(int maxNosivnost) {
        this.maxNosivost = maxNosivost;
    }

    public int getMaxNosivnost() {
        return maxNosivost;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "maxNosivnost "+ maxNosivost;
        
    }
    
}
