
package prodavnica;

/**
 *
 * @author Korisnik
 */
public class kontroler {
    
    kontroler(){};
    
    public void ukljuciUredjaje(Uredaj... uredaji) throws NeVazi
    {
        if( uredaji.length >3)
        {
            throw new NeVazi("Prevelik broj elemenata");
        }
        
        for(int i=0; i<uredaji.length; i++){
            if(uredaji[i] instanceof tv)
            {
                (( tv)uredaji[i]).stanje = true; //nema kastovanja cijelog niza vec samo posebno elemente
            }
            if(uredaji[i] instanceof frizider)
            {
                (( frizider)uredaji[i]).stanje = true;
            }
            
        }
    }
    
}
