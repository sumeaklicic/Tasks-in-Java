
package pekara;

public abstract  class proizvod {
    
    protected String naziv;
    protected int cijena;
    
    public proizvod(String naziv, int cijena)
    {
        this.naziv=naziv;
        this.cijena=cijena;
    }
    
       
    public abstract String ispisDetalja();
    
}
