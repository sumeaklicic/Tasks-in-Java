
package salonljepote;

public class kozmeticar extends osoba implements usluga {
    
    private String tipUsluge;

    public kozmeticar(String tipUsluge, String ime, String prezime) {
        super(ime, prezime);
        this.tipUsluge = tipUsluge;
    }
    
    public int cijenaUsluge() throws NepoznataUslugaException
    {
        if( tipUsluge=="Manikir")
        {
           return 30;
        }
        if( tipUsluge=="Pedikir")
        {
            return 40;
        }
        else
        {
            throw new NepoznataUslugaException("NEPOZNATA USLUGA");
        }
    }
    
}
