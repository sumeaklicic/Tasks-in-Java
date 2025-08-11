
package prodavnica;


public class frizider implements Uredaj{
    public boolean stanje;
    
    public frizider(boolean stanje){
    this.stanje=stanje;
}
    
        public void ukljuci()
    {
        stanje = true;
        System.out.println("Ukljucen sam, javlja se frizider");
    }
        
    public void iskljuci()
    {
        stanje = false;
        System.out.println("Iskljucen sam, frizider");
    }
    
    public boolean getStanje()
    {
        return stanje;
    }
    
}
