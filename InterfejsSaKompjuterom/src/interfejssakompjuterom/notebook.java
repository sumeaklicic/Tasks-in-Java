/*Kreirajte finalnu klasu Notebook koja nasljeđuje klasu Laptop i implementira interfejs Prenosivost. Ova klasa ne može biti
naslijeđena jer je označena kao final. Klasa treba implementirati metodu getTipKompjutera() koja vraća "notebook" i metodu
preracunajprenosivost() koja vraća 1 kao fiksnu vrijednost prenosivosti.*/
package interfejssakompjuterom;

final public class notebook extends Laptop implements prenosivost{
    
    notebook(int kapBat, double tezina, String os, String model, String proizvodac)
    {
        super(kapBat,tezina, os,  model,  proizvodac);
    }
    
    public String getTipKompjutera()
    {
        return "notebook";
    }
    
    public int izracunajprenosivost()
    {
        return 1;
    }
    
}
