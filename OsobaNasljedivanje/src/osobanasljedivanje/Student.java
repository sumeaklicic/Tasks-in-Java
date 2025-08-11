
package osobanasljedivanje;

public class Student extends  osoba{
    
    private int godine;
    private int studentID;

    public Student(int godine, int studentID, String ime, String prezime) {
        super(ime, prezime, godine);
        this.godine = godine;
        this.studentID = studentID;
    }

    //mozemo ispred metode napisati final i onda se vise ne moze nadglasavati, ali nije ga dobro uvijek stavljati
    @Override
    public String toString() {
        return super.toString() + " godine "+ godine+ " ID"+studentID; //moramo pozvati super da bi ispisali i dio iz bazne klase
    }
}
