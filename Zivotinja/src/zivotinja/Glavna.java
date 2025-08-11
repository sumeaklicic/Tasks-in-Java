/*
Napraviti program koji simulira zoološki vrt. Kreiraj apstraktnu klasu Zivotinja koja ima:
ime (String)
apstraktnu metodu oglasiSe() – svaka životinja se oglašava drugačije
običnu metodu ispisiOpis() koja ispisuje ime životinje
Zatim kreiraj klase Macka i Pas koje nasljeđuju Zivotinja i implementiraju oglasiSe().
U glavnoj klasi, koristi niz ili listu životinja i demonstriraj polimorfizam
tako da pozivaš oglasiSe() za svaku životinju bez obzira kojeg je tipa.
 */
package zivotinja;

public class Glavna {
    
    public static void main (String [] args)
    {
        Zivotinja [] z = new Zivotinja[2];
        z[0]= new Macka("Maci");
        z[1]=new Pas ("Coco");
        
        for( Zivotinja ziv:z)
        {
            if(ziv instanceof Zivotinja)
            {
                ziv.oglasiSe();
                //"Preko reference bazne klase možemo pozvati sve metode i za izvedene objekte, 
                //ali metode koje imamo i u baznoj klasi. Ako imamo ovveride metodu onda se ispise to kako je nadglasana"
            }
        }
    }
    
}
