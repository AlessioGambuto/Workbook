package ires.corso.parttwo.firstclasses;

import ires.corso.parttwo.firstclasses.firstclasses.*;

public class FirstClassTest {
    // Create 2 classi a vostro piacimento, ispirandovi agli oggetti che + vi piacciono.
    //
    // Includete:
    // - almeno un campo int/long
    // - almeno un campo Stringa
    // - almeno un campo boolean
    //
    // TUTTE le variabili devono essere "private"!
    //
    // Aggiungete:
    // - getter e setter per tutti i campi
    // - un costruttore diverso da quello di default che accetta almeno 2 argomenti e li imposta come valore dei campi
    // - un metodo "prettyPrint" che stampa in console le caratteristiche dell'istanza
    //
    // Fate un test creando almeno un'istanza di ciascuna classe
    public static void main(String[] args) {
        Automobile auto1 = Automobile.nuovaAutomobile("Audi", "A4", 3000, true);
        Automobile auto2 = Automobile.nuovaAutomobile(auto1.getMarca(),"A1", 1600, false);
        auto1.prettyPrint();
        auto2.prettyPrint();

        Caffe caffe1 = new Caffe("Arabica", "Brasile", 11, true);
        Caffe caffe2 = new Caffe("Robusta", "Messico", 6, true);
        caffe2.setAltarichiesta(false);
        caffe1.prettyPrint();
        caffe2.prettyPrint();
    }

}
