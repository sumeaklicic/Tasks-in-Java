/*
Napisati Java program koji modelira sistem salona ljepote koristeći principe objektno orijentisanog programiranja.
Potrebno je koristiti interfejse, nasljeđivanje, izuzetke i polimorfizam.

Kreirati interfejs Usluga koji sadrži metodu double cijenaUsluge() koja vraća cijenu usluge. Zatim napraviti apstraktnu 
klasu Osoba koja sadrži osnovne informacije: ime i prezime, konstruktor, te metodu String getPunoIme() koja vraća puno ime 
osobe u formatu "Ime Prezime".

Iz klase Osoba izvedi dvije konkretne klase: Frizer i Kozmeticar. Obje klase trebaju implementirati interfejs Usluga.

Klasa Frizer treba imati dodatni atribut brojSati, a metoda cijenaUsluge() računa cijenu kao broj sati pomnožen sa 20 KM.

Klasa Kozmeticar treba imati atribut tipUsluge koji može biti "manikir" ili "pedikir". Ako je "manikir", cijena treba biti
30 KM, a ako je "pedikir" – 40 KM. Ako se unese nepoznat tip usluge, treba se baciti izuzetak NepoznataUslugaException, koji 
nasljeđuje klasu Exception i sadrži odgovarajuću poruku o grešci.

U glavnoj main metodi, kreirati niz objekata tipa Usluga (polimorfizam) u kojem se nalaze različiti Frizer i Kozmeticar 
objekti. Iterirati kroz niz i za svaki objekat ispisati puno ime osobe i cijenu usluge. Dio koda koji se odnosi na Kozmeticar
treba biti unutar try-catch bloka kako bi se obradio mogući izuzetak.

Na ovaj način se demonstrira korištenje interfejsa (Usluga), nasljeđivanja (Osoba → Frizer/Kozmeticar), izuzetaka
(NepoznataUslugaException) i polimorfizma (niz tipa Usluga koji sadrži različite konkretne objekte).
 */
package salonljepote;

public class glavna {
    
    public static void main (String args[])
    {
        
        osoba [] o = new osoba[2];
        o[0]= new frizer(10, "Hana", "Hanic");
        o[1]=new kozmeticar("Manikir", "Belma", "Begi");
        
        try
        {
        for( osoba os:o)
        {
            if(os instanceof usluga)
            {
                System.out.println(((usluga)os).cijenaUsluge() );
            }
            else
            {
                continue;
            }
        }
        }
        catch (NepoznataUslugaException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
