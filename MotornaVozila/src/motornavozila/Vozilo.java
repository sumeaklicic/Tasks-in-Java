package motornavozila;

public class Vozilo {
    
    private int kubikaza;
    private String boja;
    private int registracija;

    public Vozilo(int kubikaza, String boja, int registracija) {
        this.kubikaza = kubikaza;
        this.boja = boja;
        this.registracija = registracija;
    }

    @Override
    public String toString() {
        return "Kubikaza "+kubikaza+ " boja " + boja+ " registracije "+registracija;  
}
}