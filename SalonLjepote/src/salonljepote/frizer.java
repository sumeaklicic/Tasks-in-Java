
package salonljepote;

public class frizer extends osoba implements usluga{
    
    private int brojSati;

    public frizer(int brojSati, String ime, String prezime) {
        super(ime, prezime);
        this.brojSati = brojSati;
    }
    
    
    public int cijenaUsluge()
    {
        return brojSati*20;
    }
    
    
}
