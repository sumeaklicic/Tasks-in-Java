/*
Napravi program koji simulira narudžbe u pekari koristeći nasljeđivanje, polimorfizam, interfejse i izuzetke.
Imat ćeš jednu apstraktnu klasu Proizvod koja sadrži atribute naziv (tipa String) i cijena (tipa double). 
U toj klasi se nalazi i apstraktna metoda ispisiDetalje() koju svaka podklasa mora implementirati.
Zatim kreiraj interfejs Narudzivo koji sadrži metodu void naruci() throws NemaNaStanjuException.
Kreiraj klasu Hljeb koja nasljeđuje klasu Proizvod i implementira interfejs Narudzivo. Ova klasa ima dodatni 
atribut naStanju tipa boolean. Metoda naruci() treba ispisati poruku da je proizvod naručen ako je na stanju, a ako nije, 
treba baciti izuzetak NemaNaStanjuException.
Napraviti posebnu klasu NemaNaStanjuException koja nasljeđuje Exception i ima konstruktor s porukom.
U glavnoj metodi main() kreirati niz od dva Proizvod objekta (koristeći polimorfizam, npr. 
Proizvod[] proizvodi = new Proizvod[2];). Inicijalizuj objekte klase Hljeb s različitim stanjima (true i false) i pokušaj
naručiti svaki od njih koristeći try-catch blok. Ispisuj informacije o proizvodima pozivom metode ispisiDetalje().
 */
package pekara;


public class Glavna {

    public static void main(String[] args) {
        proizvod[] p = new proizvod[2];
        p[0] = new hljeb("haa", 12, true);
        p[1] = new hljeb("ba", 11, false);

        for (proizvod pro : p) {
            if (pro instanceof proizvod) {
                System.out.println(pro.ispisDetalja());
            }
        }

        try {
           ( (narucivanje) p[1]).naruci(); //U Javi možeš kastovati objekat u bilo koji interfejs koji taj objekat implementira — i to se zove interface casting.
        } catch (NemaNaStanjuException e) {
            System.out.println("GRESKA: " + e.getMessage());
        }
    }
}
