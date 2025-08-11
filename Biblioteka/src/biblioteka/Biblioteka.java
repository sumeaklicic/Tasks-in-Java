/*
ZADATAK: Sistem za upravljanje bibliotekom

Cilj: Vježbati nasljeđivanje, interfejse, polimorfizam i izuzetke u programskom jeziku Java.

----------------------------------------------------------
1. INTERFEJS: Borrowable (Mogućnost posuđivanja)
----------------------------------------------------------
- Napraviti interfejs Borrowable sa metodama:
    - void borrow(String korisnik)
    - void returnItem()
    - boolean isBorrowed()

----------------------------------------------------------
2. APSTRAKTNA KLASA: LibraryItem (Stavka biblioteke)
----------------------------------------------------------
- Atributi:
    - String naslov
    - int godina
- Konstruktor i metoda toString()
- Apstraktna metoda:
    - void displayInfo() // ispis informacija o stavci

----------------------------------------------------------
3. PODKLASE: Book (Knjiga)
----------------------------------------------------------
- Book nasljeđuje klasu LibraryItem
- Svaka klasa implementira displayInfo() na svoj način (polimorfizam)

----------------------------------------------------------
4. IZUZETAK: AlreadyBorrowedException (Već posuđeno)
----------------------------------------------------------
- Napraviti klasu AlreadyBorrowedException koja nasljeđuje Exception
- Baciti ovaj izuzetak ako neko pokuša posuditi stavku koja je već posuđena

----------------------------------------------------------
5. GLAVNI PROGRAM (main metoda):
----------------------------------------------------------
- Napraviti listu različitih LibraryItem objekata (knjige, filmovi, časopisi)
- Pozvati displayInfo() za sve stavke (koristeći polimorfizam)
- Pokušati posuditi knjigu i film
- Ako su već posuđeni, uhvatiti AlreadyBorrowedException
- Pozvati returnItem() za vraćanje posuđenih stavki
- Prikazati informaciju da li je stavka trenutno posuđena

*/

package biblioteka;

public class Biblioteka {


    public static void main(String[] args) {
        
        bibliotek[ ] b = new bibliotek[2]; //duzina je 2 a index ide od 0 do 1
        b[0]= new knjiga("Mesa", 1984, true);
        b[1]= new knjiga("Ivan", 1945, false);
        
        for(bibliotek bib:b)
        {
            
            if(bib instanceof bibliotek)
            {
                System.out.println(bib.displayInfo());
            }
        }
        
        try
        {
           ((knjiga) b[1]).posudivanjeKnjige(); //to je metoda klase knjiga a mi imamo niz tipa biblioteka
           //zato je potrebno pretvoriti u ovaj tip knjiga
        }
        catch(AlreadyBorrowedException a)
        {
            System.out.println("GRESKA: "+ a.getMessage());
        }
        

    }
    
}
