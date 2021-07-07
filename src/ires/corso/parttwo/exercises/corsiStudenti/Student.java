package ires.corso.parttwo.exercises.corsiStudenti;

public class Student {
    private final String codiceStudente;
    private final String cognome;
    private final String nome;

    public Student(String codiceStudente, String cognome, String nome){
        this.codiceStudente = codiceStudente;
        this.cognome = cognome;
        this.nome = nome;
    }

    public String getCodiceStudente() {
        return codiceStudente;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }
}
