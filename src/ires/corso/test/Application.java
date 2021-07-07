package ires.corso.test;

import java.util.Scanner;

public class Application {
    public static void main (String [] args){
        System.out.println("----------BIBLIOTECA---------------");
        Scanner in = new Scanner(System.in);
        boolean esc = false;
        System.out.println("Benvenuto nella Biblioteca");
        while(!esc){
            System.out.println("1. Visualizzazione dei volumi esistenti");
            System.out.println("2. Aggiungi Volume");
            System.out.println("3. Modifica un volume");
            System.out.println("4. Elimina un volume");
            System.out.println("5. Aggiorna valutazione e/o stato lettura");
            System.out.println("6. Export");
            System.out.println("7. Uscita");
        }
        //Manca l'implementazione di un menu funzionante, dell'inizializzazione della biblioteca e della scrittura finale.
    }
}
