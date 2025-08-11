
package biblioteka;

public class bibliotek {
    
    protected String naslov;
    protected int godina;
    
    bibliotek(String naslov, int godina)
    {
        this.naslov=naslov;
        this.godina=godina;
    }
    
    @Override
    public String toString()
    {
        return "Naslov "+naslov+ ", godina "+godina;
    }
    
    public String displayInfo()
    {
        return "Naslov "+naslov+ ", godina "+godina;
    }
    
    
}
