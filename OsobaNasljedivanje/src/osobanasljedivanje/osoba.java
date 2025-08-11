
package osobanasljedivanje;


public class osoba {
    
    protected String ime;
    protected  String prezime;
    protected int godine;

    public osoba(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    @Override
    public String toString() {
        return " ime " + ime+ " prezime "+ prezime+" godine "+ godine;
    }
    
    
    
}
