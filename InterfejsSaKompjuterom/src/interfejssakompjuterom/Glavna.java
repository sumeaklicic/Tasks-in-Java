/*Kreirajte aplikaciju za modeliranje različitih vrsta uređaja, uključujući računare, laptope, notebooke i MP3 plejere. Ovaj sistem
treba omogućiti praćenje informacija o uređajima kao što su model, proizvođač, tip uređaja, prenosivost i druge karakteristike. Svaka
klasa treba implementirati odgovarajuće metode kako bi osigurala funkcionalnost prema zahtjevima zadatka.

Klasa Uredaj treba imati sljedeće atribute: model (String), koji predstavlja naziv modela uređaja i proizvodac (String), 
koji predstavlja proizvođača uređaja. Klasa treba imati konstruktor koji prima model i proizvodac, te metode: getModel() koja 
vraća model uređaja, getProizvodac() koja vraća proizvođača uređaja, setModel(String model) za postavljanje modela uređaja i
setProizvodac(String proizvodac) za postavljanje proizvođača uređaja.

Kreirajte interfejs Prenosivost koji ima metodu preracunajprenosivost(). Ova metoda treba biti implementirana u svim klasama koje
zahtijevaju izračun prenosivosti.

Kreirajte  klasu Kompjuter koja nasljeđuje klasu Uredaj. Ova klasa treba imati atribut os (String) koji predstavlja
operativni sistem računara. Klasa treba imati konstruktor koji prima os, model i proizvodac, te metode: getOs() koja vraća
operativni sistem računara, getTipKompjutera() koja je apstraktna metoda i treba biti implementirana u izvedenim klasama.

Kreirajte klasu Desktop koja nasljeđuje klasu Kompjuter i implementira interfejs Prenosivost. Ova klasa treba imati atribut visina 
(double) koji predstavlja visinu računara u cm. Klasa treba imati konstruktor koji prima visina, model, proizvodac i os. Također
treba implementirati metodu getTipKompjutera() koja vraća "desktop", kao i metodu preracunajprenosivost() koja računa kategoriju
prenosivosti prema formuli 5 + visina / 30.

Kreirajte klasu Laptop koja nasljeđuje klasu Kompjuter i implementira interfejs Prenosivost. Ova klasa treba imati atribute kapacBat
(int) koji predstavlja kapacitet baterije u mAh i tezina (double) koja predstavlja težinu laptopa u kilogramima. Klasa treba imati
konstruktor koji prima kapacBat, tezina, model, proizvodac i os. Također treba implementirati metodu getTipKompjutera() koja vraća 
"laptop", kao i metodu preracunajprenosivost() koja vraća težinu laptopa zaokruženu na cijeli broj.

Kreirajte finalnu klasu Notebook koja nasljeđuje klasu Laptop i implementira interfejs Prenosivost. Ova klasa ne može biti
naslijeđena jer je označena kao final. Klasa treba implementirati metodu getTipKompjutera() koja vraća "notebook" i metodu
preracunajprenosivost() koja vraća 1 kao fiksnu vrijednost prenosivosti.

Kreirajte klasu MP3 koja nasljeđuje klasu Uredaj i implementira interfejs Prenosivost. Ova klasa treba imati atribute kapBat 
(int) koji predstavlja kapacitet baterije u mAh i velicinaMemor (int) koji predstavlja veličinu memorije u GB. Klasa treba imati
konstruktor koji prima kapBat, velicinaMemor, model i proizvodac. Također treba implementirati metodu preracunajprenosivost() koja
vraća 1 kao fiksnu vrijednost prenosivosti (MP3 uređaj je prenosiv).

Kreirajte klasu Glavna u kojoj instancirate nekoliko objekata tipa Uredaj, uključujući Desktop, Laptop, Notebook i MP3. Zatim 
ispišite informacije o svakom uređaju, uključujući model, proizvođača, tip uređaja i prenosivost. Koristite operator instanceof
za provjeru tipa uređaja i ispisivanje specifičnih informacija u skladu s tipom uređaja.

U ovoj klasi koristite polimorfizam kako biste dinamički upravljali uređajima različitih tipova, pozivajući odgovarajuće metode 
za svaki uređaj. Također, koristite operator instanceof za provjeru tipa objekta prije nego što pozovete specifične metode za
prenosivost i tip uređaja.*/
package interfejssakompjuterom;

public class Glavna {
    
    public static void main(String args[])
    {
        uredaj u[]= new uredaj[3];
        u[1]= new desktop(2.5, "win", "qt4", "lenovo");
        u[2]=new Laptop(5, 1.2,"win", "qt4", "lenovo");
        u[0]= new mp3(5, 9, "hp", "yew");
        
        for( uredaj uredajobj: u )
        {
            // Provjerite tip uređaja i pozovite odgovarajuće metode
            if (uredajobj instanceof kompjuter) {  // Provjera da li je uređaj instance 
                System.out.println("Tip uređaja: " + ((kompjuter) uredajobj).getTipKompjutera()); // Ispis tipa uređaja
            }
            if (uredajobj instanceof prenosivost) { // Provjera da li implementira prenosivost
                    System.out.println("Prenosivost: " + ((prenosivost) uredajobj).izracunajprenosivost()); // Ispis prenosivosti
                    //uvijek prvo u zagradu ide ime interface pa onda ime objekta kojim radimo i tacka poziv metode
                }
        }
        
    }
    
    
}
    




