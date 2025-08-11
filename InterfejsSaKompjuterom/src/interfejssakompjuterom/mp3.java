/*Kreirajte klasu MP3 koja nasljeđuje klasu Uredaj i implementira interfejs Prenosivost. Ova klasa treba imati atribute kapBat 
(int) koji predstavlja kapacitet baterije u mAh i velicinaMemor (int) koji predstavlja veličinu memorije u GB. Klasa treba imati
konstruktor koji prima kapBat, velicinaMemor, model i proizvodac. Također treba implementirati metodu preracunajprenosivost() koja
vraća 1 kao fiksnu vrijednost prenosivosti (MP3 uređaj je prenosiv).*/
package interfejssakompjuterom;


public class mp3 extends uredaj implements prenosivost {
    
    private int kapBat;
    private int velMem;

    public mp3(int kapBat, int velMem, String model, String proizvodac) {
        super(model, proizvodac);
        this.kapBat = kapBat;
        this.velMem = velMem;
    }
    
    public int izracunajprenosivost()
    {
        return 1;
    }
    
}
