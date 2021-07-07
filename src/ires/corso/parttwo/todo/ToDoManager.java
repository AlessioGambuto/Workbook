package ires.corso.parttwo.todo;

import java.time.LocalDate;
import java.util.Scanner;

// GRUPPO 2:
public class ToDoManager {
    // Classe responsabile per le operazioni sull'insieme dei TO-DO:
    // - metodi per creazione nuovo TO-DO
    // - metodi per la modifica, la rimozione
    // - gestisce input utente (cioè loop di richiesta di quali campi devono essere modificati)
    // - ha al suo interno funzioni di controllo sull'input utente
    public void createNewToDo() {
        ToDo todo = new ToDo();
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il titolo");
        String input = in.nextLine();
        todo.setTitolo(input);
        System.out.println("Inserisci la descrizione");
        input = in.nextLine();
        todo.setDescrizione(input);
        System.out.println("Inserisci la data di consegna(yyyy/mm/dd");
        input = in.nextLine();
        todo.setDataConsegna(LocalDate.parse(input));
        System.out.println("Inserisci la priorità(Alta, Media, Bassa)");
        input = in.nextLine();
        todo.setPriorita(input);
        System.out.println("Inserisci lo stato(DaFare, InEsecuzione, Completato, Annullato)");
        input = in.nextLine();
        todo.setStato(input);
        ToDoRepository.add(todo);
    }

    public void updateToDo() {
        // Chiede quale Id si vuole modificare
        // Si chiede un "clone" del TO-DO
        // Loop di richiesta dati da modificare
        // Salvataggio delle modifiche tramite ToDoRepository (update...)

        Scanner in = new Scanner(System.in);
        System.out.println("Quale todo vuoi modificare?(Inserisci il relativo ID)");
        Long input = in.nextLong();
        ToDo cloneDaModif = ToDo.cloneForUpdate(ToDoRepository.getById(input));
        int nav;
        String inputModif;
        boolean esc = false;

        while (esc == false) {
            System.out.println("Cosa vuoi modificare?");
            System.out.println("1. Titolo");
            System.out.println("2. Descrizione");
            System.out.println("3. Data di consegna");
            System.out.println("4. Priorità");
            System.out.println("5. Stato");
            System.out.println("6. Esci");
            nav = in.nextInt();
            switch (nav){
                case 1:{
                    System.out.println("Inserisci il nuovo titolo");
                    inputModif = in.nextLine();
                    cloneDaModif.setTitolo(inputModif);
                }
                case 2:{
                    System.out.println("Inserisci la nuova descrizione");
                    inputModif = in.nextLine();
                    cloneDaModif.setDescrizione(inputModif);
                }
                case 3:{
                    System.out.println("Inserisci la nuova data di consegna");
                    inputModif = in.nextLine();
                    cloneDaModif.setDataConsegna(LocalDate.parse(inputModif));
                }
                case 4:{
                    System.out.println("Inserisci la nuova priorità");
                    inputModif = in.nextLine();
                    cloneDaModif.setPriorita(inputModif);
                }
                case 5:{
                    System.out.println("Inserisci il nuovo stato");
                    inputModif = in.nextLine();
                    cloneDaModif.setStato(inputModif);
                }
                case 6:{
                    esc = true;
                }
                default:{
                    System.out.println("Non ho capito cosa vuoi modificare");
                }
                if (esc!=true){
                    System.out.println("Vuoi fare altre modifiche?(s/n)");
                    inputModif = (in.nextLine()).toLowerCase();
                    if (inputModif.equals("n")){
                        esc = true;
                    }
                }
            }

        }
        ToDoRepository.update(cloneDaModif);
    }
    public void removeToDo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quale todo vuoi rimuovere?(Inserisci il relativo ID)");
        Long input = in.nextLong();
        ToDoRepository.delete(input);
    }
    }
}
