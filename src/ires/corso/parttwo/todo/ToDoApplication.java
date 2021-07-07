package ires.corso.parttwo.todo;

import java.util.Scanner;

// GRUPPO 3/4:
public class ToDoApplication
{
    // 1. Deserializza il repository da file (carica i dati dell'ultimo salvataggio)
    //    creando una classe Repository
    // 2. Gestione del MENU principale con un loop e due switch
    // 3. In corrispondenza di una scelta dell'utente (ramo dello switch) chiama
    //    le classi necessarie per svolgere l'azione
    // 4. Chiede conferma e serializza in uscita
    // 5. Fornisce anche i metodi della classe "lettore" di quiz... askForInput , display

public static void main(String [] Args){
    Scanner in = new Scanner(System.in);
    boolean esc = false;
    System.out.println("Benvenuto nella TODO list:");
    while(!esc){
        System.out.println("1. Visualizza");
        System.out.println("2. Aggiungi, Rimuovi, Modifica");
        System.out.println("3. Import/Export");
        System.out.println("4. Esci");
        int input = in.nextInt();
        switch (input){
            case 1:{
                System.out.println("In che ordine vorresti visualizzare i ToDo");
                System.out.println("1. Priorità");
                System.out.println("2. Data di scadenza");
                System.out.println("3. Stato");
                System.out.println("4. Torna indietro");
                input = in.nextInt();
                switch (input){
                    case 1:{

                    }
                    case 2:{

                    }
                    case 3:{

                    }
                    case 4:{

                    }
                    default:{

                    }
                }
            }
            case 2:{
                System.out.println("Cosa vuoi fare con i ToDo");
                System.out.println("1. Aggiungi");
                System.out.println("2. Rimuovi");
                System.out.println("3. Modifica");
                System.out.println("4. Torna indietro");
                input = in.nextInt();
                switch (input) {
                    case 1: {

                    }
                    case 2: {

                    }
                    case 3: {

                    }
                    case 4: {

                    }
                    default: {

                    }
                }
            }
            case 3:{
                System.out.println("Scegli se vuoi importare o esportare");
                System.out.println("1. Import");
                System.out.println("2. Export");
                System.out.println("3. Torna indietro");
                input = in.nextInt();
                switch (input){
                    case 1:{

                    }
                    case 2:{

                    }
                    case 3:{

                    }
                    default:{

                    }
            }
            }
            case 4:{
                System.out.println("Arrivederci");
                esc = true;
            }
            default:{

            }
        }
    }
}
}
