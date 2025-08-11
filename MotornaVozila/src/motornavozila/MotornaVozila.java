
package motornavozila;
//Motor ima kubikazu, registracijske oznake, boju, da li je natkriven ili ne
//Automobil ima kubikazu, reg.tablice i boju, ali i oznaku da li je kabriolet ili ne
//Kamion ima kubikazu, boju i reg tablicama, ali i podatak o max nosivosti
//Napisati sistem klasa te ispisati podatke

public class MotornaVozila {

    public static void main(String[] args) {
        
        Motor jedan = new Motor(true, 123, "zelena", 123456);
        System.out.println("Motor "+ jedan);
    }
    
}
