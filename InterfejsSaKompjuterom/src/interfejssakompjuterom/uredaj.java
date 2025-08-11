/*Klasa Uredaj treba imati sljedeće atribute: model (String), koji predstavlja naziv modela uređaja i proizvodac (String), 
koji predstavlja proizvođača uređaja. Klasa treba imati konstruktor koji prima model i proizvodac, te metode: getModel() koja 
vraća model uređaja, getProizvodac() koja vraća proizvođača uređaja, setModel(String model) za postavljanje modela uređaja i
setProizvodac(String proizvodac) za postavljanje proizvođača uređaja.*/
package interfejssakompjuterom;

public class uredaj {
    
    protected String model;
    protected String proizvodac;

    public uredaj(String model, String proizvodac) {
        this.model = model;
        this.proizvodac = proizvodac;
    }

    public String getModel() {
        return model;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProizvodac() {
        return proizvodac;
    }
    
    
    
}
