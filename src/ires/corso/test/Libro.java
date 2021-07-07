package ires.corso.test;

import ires.corso.test.enums.*;
import java.time.LocalDate;

public class Libro{
    private long id;
    private String titolo;
    private String autore;
    private String sinossi;
    private String isbn;
    private LocalDate dataPubblicazione;
    private Genere genere;
    private Gradimento gradimento;
    private int avanzLettura;


    public Libro(long id, String titolo, String autore, String sinossi, String isbn, LocalDate dataPubblicazione, Genere genere, Gradimento gradimento, int avanzLettura) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.sinossi = sinossi;
        this.isbn = isbn;
        this.dataPubblicazione = dataPubblicazione;
        this.genere = genere;
        this.gradimento = Gradimento.DaValutare;
        this.avanzLettura = 0;
    }

    public Libro(){
        this.gradimento = Gradimento.DaValutare;
        this.avanzLettura = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getSinossi() {
        return sinossi;
    }

    public void setSinossi(String sinossi) {
        this.sinossi = sinossi;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(String dataPubblicazione) {
        this.dataPubblicazione = LocalDate.parse(dataPubblicazione);
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = Genere.valueOf(genere);
    }

    public Gradimento getGradimento() {
        return gradimento;
    }

    public void setGradimento(String gradimento) {
        this.gradimento = Gradimento.valueOf(gradimento);
    }

    public int getAvanzLettura() {
        return avanzLettura;
    }

    public void setAvanzLettura(int avanzLettura) {
        this.avanzLettura = avanzLettura;
    }

    /* Metodo per clonare il libro
    public Libro clonaLibro(Libro originale) {
        Libro clone = new Libro();
        clone.id = originale.id;
        clone.titolo = originale.titolo;
        clone.autore = originale.autore;
        clone.sinossi = originale.sinossi;
        clone.isbn = originale.isbn;
        clone.dataPubblicazione = originale.dataPubblicazione;
        clone.genere = originale.genere;
        clone.gradimento = originale.gradimento;
        clone.avanzLettura = originale.avanzLettura;
        return clone;
    }
    */

    //Prova con metodo clone dell'interfaccia cloneable
    public static Libro clonaLibro(Libro l){
        try {
            Libro clone = (Libro) l.clone();
            return clone;
        } catch (Exception e){
            System.out.println("Clone non possibile");
            return null;
        }
    }

    public String prettyPrint() {
        String s = String.format("Id: %d \n Titolo: %s \n Autore: %s \n Sinossi: %s \n Isbn: %s \n Data di Pubblicazione: %s \n Genere: %s \n Gradimento: %s \n Avanzamento Lettura: %d",
        getId(), getTitolo(), getAutore(), getSinossi(), getIsbn(), getDataPubblicazione().toString(), getGenere().toString(), getGradimento().toString(), getAvanzLettura());
        return s;
    }
}
