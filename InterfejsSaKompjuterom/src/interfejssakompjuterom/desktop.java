/* Kreirajte klasu Desktop koja nasljeđuje klasu Kompjuter i implementira interfejs Prenosivost. Ova klasa treba imati atribut visina 
(double) koji predstavlja visinu računara u cm. Klasa treba imati konstruktor koji prima visina, model, proizvodac i os. Također
treba implementirati metodu getTipKompjutera() koja vraća "desktop", kao i metodu preracunajprenosivost() koja računa kategoriju
prenosivosti prema formuli 5 + visina / 30.*/
package interfejssakompjuterom;


public class desktop extends kompjuter implements prenosivost {
    private double visina;

    public desktop(double visina, String os, String model, String proizvodac) {
        super(os, model, proizvodac);
        this.visina = visina;
    }
    
    @Override
    public String getTipKompjutera()
    {
    return "desktop";
    }

    @Override
    public int izracunajprenosivost() {
        return (int) ((5+visina)/30);
    }
}
