
package salonljepote;


public class osoba {
    
    protected String ime, prezime;

    public osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
    
    
    public String getPunoIme()
    {
        return ime +"  "+prezime;
    }
    
}
