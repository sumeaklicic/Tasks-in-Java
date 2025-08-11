
package osobanasljedivanje;


public class Profesor extends osoba {
    private String email;
    private String predmeti;
    private double plata;
    

    public Profesor(String email, String predmeti, String ime, String prezime, int godine, double plata) {
        super(ime, prezime, godine);
        this.email = email;
        this.predmeti = predmeti;
        this.plata = plata;
    }

    @Override
    public String toString() {
        return super.toString() + " predmeti "+predmeti+" email "+ email;
    }
    
    public void povecajplatu(int postotak)
    {
        int broj=postotak/100;
        plata = plata + plata*broj ;
    }
    
public static void povecajPlatu( int postotakUvecanja, Profesor... prof) //varargs
{
    for (Profesor p : prof)
    {
        p.povecajplatu(postotakUvecanja);
    }
}

}
