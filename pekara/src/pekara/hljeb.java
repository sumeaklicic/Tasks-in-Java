
package pekara;

public class hljeb extends proizvod implements narucivanje {
    
    private boolean naStanju;
    
    public hljeb(String naziv, int cijena, boolean naStanju)
    {
        super(naziv,cijena);
        this.naStanju = naStanju;
    }
    
    public void naruci() throws NemaNaStanjuException
    {
        if(naStanju == true)
        {
            System.out.println("Narucili ste");
        }
        else
        {
            throw new NemaNaStanjuException("Proizvod nije na stanju");
        }
    }
    
    @Override
    public String ispisDetalja()
    {
        return "Naziv "+naziv+" cijena "+cijena+" na stanju "+naStanju;
    }
    
}
