

package prodavnica;

public class tv implements Uredaj {

    public boolean stanje;
    public tv(boolean stanje){
    this.stanje=stanje;
    };
    
    public void ukljuci()
    {
        stanje= true;
        System.out.println("Ukljucen sam");
    }
    
    public void iskljuci()
    {
        stanje= false;
        System.out.println("Iskljucen sam");
    }
    
        public boolean getStanje()
    {
        return stanje;
    }
    
}
