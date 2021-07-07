package ires.corso.parttwo.todo;

import java.io.Serializable;
import java.time.LocalDate;

public class ToDo implements Serializable
{
    public enum Priorita{Bassa, Media, Alta};
    public enum Stato{DaFare, InEsecuzione, Completato, Annullato};

    // Properties dell'istanza
    private long id;
    protected String titolo;
    protected String descrizione;
    protected LocalDate dataCreazione;
    protected LocalDate dataConsegna;
    protected Priorita priorita;
    protected Stato stato;

    protected long getID() {
        return this.id;
    }

    protected ToDo(long id, String titolo, String descrizione, LocalDate dataConsegna, Priorita priorita, Stato stato) {
        this.id = id;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.dataCreazione = LocalDate.now();
        this.dataConsegna = dataConsegna;
        this.priorita = priorita;
        this.stato = stato;
    }

    protected ToDo(){
        this.dataCreazione = LocalDate.now();
    }

    public static ToDo cloneForUpdate(ToDo orig) {
        // fabbrica una copia esatta del To-Do (compreso l'ID)
        ToDo clone = new ToDo();
        clone.id = orig.id;
        clone.titolo = orig.titolo;
        clone.descrizione = orig.descrizione;
        clone.dataCreazione = orig.dataCreazione;
        clone.dataConsegna = orig.dataConsegna;
        clone.priorita = orig.priorita;
        clone.stato = orig.stato;
        return clone;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public LocalDate getDataCreazione() {
        return dataCreazione;
    }

    public LocalDate getDataConsegna() {
        return dataConsegna;
    }

    public Priorita getPriorita() {
        return priorita;
    }

    public Stato getStato() {
        return stato;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setDataConsegna(LocalDate dataConsegna) {
        this.dataConsegna = dataConsegna;
    }

    public void setPriorita(String priorita) {
        this.priorita = Priorita.valueOf(priorita);
    }

    public void setStato(String stato) {
        this.stato = Stato.valueOf(stato);
    }
}