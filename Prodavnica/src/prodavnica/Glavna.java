/*
Napravi interfejs Uredjaj koji sadrži metode:
void ukljuci()
void iskljuci()

Napravi klase TV, Frizider koje implementiraju interfejs Uredjaj.
Svaka neka ispisuje različitu poruku prilikom uključivanja i isključivanja.

Napravi izuzetak PrekoracenjeIzuzetak koji se baca ako pokušamo uključiti više od 3 uređaja istovremeno.

Napravi klasu Kontroler koja ima metodu:

void ukljuciUredjaje(Uredjaj... uredjaji) throws PrekoracenjeIzuzetak

Ako korisnik pokuša uključiti više od 3 uređaja odjednom, baci izuzetak.

Inače, uključi svaki uređaj i ispiši njegovu poruku.

U main metodi, kreiraj više uređaja, pozovi ukljuciUredjaje sa 2, a zatim sa 4 uređaja, i obradi izuzetak.




 */
package prodavnica;

/**
 *
 * @author Korisnik
 */
public class Glavna {
    
    public static void main(String [] args)
    {

        tv t = new tv(false);
        frizider f = new frizider(false);
        kontroler k = new kontroler();

        try {
            k.ukljuciUredjaje(t, f);
        } catch (NeVazi e) {
            System.out.println(e.getMessage());
        }

        System.out.println("TV stanje: " + t.getStanje());
        System.out.println("Frizider stanje: " + f.getStanje());
    }
}

   
    