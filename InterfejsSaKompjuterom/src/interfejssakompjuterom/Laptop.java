/*Kreirajte klasu Laptop koja nasljeđuje klasu Kompjuter i implementira interfejs Prenosivost. Ova klasa treba imati atribute kapacBat
(int) koji predstavlja kapacitet baterije u mAh i tezina (double) koja predstavlja težinu laptopa u kilogramima. Klasa treba imati
konstruktor koji prima kapacBat, tezina, model, proizvodac i os. Također treba implementirati metodu getTipKompjutera() koja vraća 
"laptop", kao i metodu preracunajprenosivost() koja vraća težinu laptopa zaokruženu na cijeli broj.*/
package interfejssakompjuterom;

public class Laptop extends kompjuter implements prenosivost{
    protected int kapBat;
    protected double tezina;

    public Laptop(int kapBat, double tezina, String os, String model, String proizvodac) {
        super(os, model, proizvodac);
        this.kapBat = kapBat;
        this.tezina = tezina;
    }
    
    public String getTipKompjutera()
    {
        return "laptop";
    }
    
    public int izracunajprenosivost()
    {
        return (int)tezina;
    }
    
}
