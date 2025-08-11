/*Kreirajte klasu Kompjuter koja nasljeđuje klasu Uredaj. Ova klasa treba imati atribut os (String) koji predstavlja
operativni sistem računara. Klasa treba imati konstruktor koji prima os, model i proizvodac, te metode: getOs() koja vraća
operativni sistem računara, getTipKompjutera() koja je apstraktna metoda i treba biti implementirana u izvedenim klasama*/
package interfejssakompjuterom;


public abstract class kompjuter extends uredaj {
    
    protected String os;

    public kompjuter(String os, String model, String proizvodac) {
        super(model, proizvodac);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    
    public abstract String getTipKompjutera();
    
}
