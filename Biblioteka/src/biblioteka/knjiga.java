
package biblioteka;

public class knjiga extends bibliotek implements posudivanje {
    
    private boolean stanjeKnjige=true;

    public knjiga(String naslov, int godina, boolean stanjeKnjige) {
        super(naslov, godina);
        this.stanjeKnjige=stanjeKnjige;
    }
    
    
    @Override 
    public String displayInfo(){
        return "Nalov "+ naslov+ ", godina" + godina;
    }
    
    
    
    @Override
    public void posudivanjeKnjige() throws AlreadyBorrowedException //Zagrada ide prije imena izuzetka
    {
        if(stanjeKnjige == true)
        {
            System.out.println("Posudili ste knjigu");
            stanjeKnjige=false;
        }
        else
        {
            throw new AlreadyBorrowedException("Knjiga nije na stanju"); //Mora ici new
        }
    }
    
    @Override
    public void vracanjeKnjige()
    {
        if(stanjeKnjige==false)
        {
            System.out.println("Vratili ste knjigu");
            stanjeKnjige=true;          
        }
        else
        {
            System.out.println("Knjiga je vec na stanju");         
        }
    }
}
