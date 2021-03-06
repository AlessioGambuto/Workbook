package ires.corso.parttwo.exercises.corsiStudenti;

public class Course {
    private final String titolo;
    private final String descrizione;
    private final String settore;

    public Course(String titolo, String descrizione, String settore){
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.settore = settore;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getSettore() {
        return settore;
    }
}
