package ires.corso.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

    public static void nuovoLibro() {
        Libro l = new Libro();
        Scanner in = new Scanner(System.in);
        String input;

        System.out.println("Aggiunta di un libro...");

        System.out.println("Inserisci il titolo:");
        input = in.nextLine();
        l.setTitolo(input);

        System.out.println("Inserisci l'autore:");
        input = in.nextLine();
        l.setAutore(input);

        System.out.println("Inserisci la sinossi:");
        input = in.nextLine();
        l.setSinossi(input);

        System.out.println("Inserisci l'ISBN:");
        input = in.nextLine();
        l.setIsbn(input);

        try {
            System.out.println("Inserisci la data di pubblicazione (AAAA-MM-GG):");
            input = in.nextLine();
            l.setDataPubblicazione(input);

            System.out.println("Inserisci il genere (Fantasy, Thriller, Horror, Giallo, Commedia, Storico):");
            input = in.nextLine();
            l.setGenere(input);

        } catch (Exception e) {
            System.out.println("Non hai inserito correttamente i dati in input, verrai riportato al menù principale.");
            return;
        }

        System.out.println("Sei sicuro di voler inserire questo libro?(S per confermare, premi qualsiasi altro tasto per annullare)");
        input = in.nextLine();
        if (input.toLowerCase().equals("s")) {
            System.out.println("Il libro è stato aggiunto");
            Biblioteca.repository.aggiungi(l);
        } else {
            System.out.println("Il libro non è stato aggiunto");
        }

    }

    public static void modificaVolume() {

        Scanner in = new Scanner(System.in);
        System.out.println("Modifica di un libro...");
        System.out.println("Quale libro vuoi modificare? (Inserisci il relativo ID)");

        Long input = in.nextLong();

        if (Biblioteca.containsId(input)) {
            Libro cloneModif = Libro.clonaLibro(Biblioteca.getLibroById(input));
            int nav;
            String inputModif;
            boolean esc = false;

            while (esc == false) {
                System.out.println("Cosa vuoi modificare?");
                System.out.println("1. Titolo");
                System.out.println("2. Autore");
                System.out.println("3. Sinossi");
                System.out.println("4. ISBN");
                System.out.println("5. Data di pubblicazione");
                System.out.println("6. Genere");
                System.out.println("7. Esci");
                nav = in.nextInt();
                switch (nav) {
                    case 1: {
                        System.out.println("Inserisci il nuovo titolo:");
                        inputModif = in.nextLine();
                        cloneModif.setTitolo(inputModif);
                        break;
                    }
                    case 2: {
                        System.out.println("Inserisci il nuovo autore:");
                        inputModif = in.nextLine();
                        cloneModif.setAutore(inputModif);
                        break;
                    }
                    case 3: {
                        System.out.println("Inserisci la nuova sinossi:");
                        inputModif = in.nextLine();
                        cloneModif.setSinossi(inputModif);
                        break;
                    }
                    case 4: {
                        System.out.println("Inserisci il nuovo ISBN:");
                        inputModif = in.nextLine();
                        cloneModif.setIsbn(inputModif);
                        break;
                    }
                    case 5: {
                        try {
                            System.out.println("Inserisci la nuova data di pubblicazione(AAAA-MM-GG):");
                            inputModif = in.nextLine();
                            cloneModif.setDataPubblicazione(inputModif);
                            break;
                        } catch (Exception e) {
                            System.out.println("La data non è inserita correttamente");
                            break;
                        }
                    }
                    case 6: {
                        try {
                            System.out.println("Inserisci il nuovo genere:");
                            inputModif = in.nextLine();
                            cloneModif.setGenere(inputModif);
                            break;
                        } catch (Exception e) {
                            System.out.println("Il genere inserito non è corretto");
                            break;
                        }
                    }
                    case 7: {
                        esc = true;
                        break;
                    }
                    default: {
                        System.out.println("Non ho capito, riprova.");
                        break;
                    }
                }
            }
            Biblioteca.aggiorna(cloneModif);
        } else {
            System.out.println("L'ID specificato non corrisponde a nessun libro nella biblioteca");
        }
    }

    public static void rimuoviLibro() {
        Scanner in = new Scanner(System.in);
        System.out.println("Rimozione di un libro...");
        System.out.println("Quale libro vuoi rimuovere? (Inserisci il relativo ID)");
        Long input = in.nextLong();
        String forse;

        if (Biblioteca.containsId(input)) {
            System.out.println("Sei sicuro di voler rimuovere questo libro?(s per confermare, qualsiasi altro tasto per annullare)");
            forse = in.nextLine();
            if (forse.toLowerCase().equals("s")) {
                Biblioteca.rimuovi(input);
                System.out.println("Rimosso con successo.");
            }
        } else {
            System.out.println("L'ID specificato non corrisponde a nessun libro nella biblioteca");
        }
    }


    public static void modificaGiudizioAvanzamento() {
        Scanner in = new Scanner(System.in);
        System.out.println("Modifica Valutazione Libro e Avanzamento Lettura...");
        System.out.println("A quale libro vuoi apportare modifiche? (Inserisci il relativo ID)");

        Long input = in.nextLong();

        if (Biblioteca.containsId(input)) {
            Libro cloneModif = Libro.clonaLibro(Biblioteca.getLibroById(input));
            int nav;
            String inputModif;
            boolean esc = false;
            while (esc == false) {
                System.out.println("Cosa vuoi modificare?");
                System.out.println("1. Valutazione");
                System.out.println("2. Avanzamento Lettura");
                System.out.println("3. Esci");
                nav = in.nextInt();
                switch (nav) {
                    case 1: {
                        if (Biblioteca.libroCompletato(cloneModif)) {
                            try {
                                System.out.println("Inserisci la nuova valutazione(DaValutare, Brutto, Carino, Bello, Capolavoro)");
                                inputModif = in.nextLine();
                                cloneModif.setGradimento(inputModif);
                                break;
                            } catch (Exception e) {
                                System.out.println("Valutazione non valida");
                                break;
                            }
                        } else {
                            System.out.println("Non puoi valutare un libro che non hai finito di leggere.");
                            break;
                        }
                    }
                    case 2: {
                        System.out.println("Inserisci l'avanzamento di lettura(da 1 a 100):");
                        int percentuale = in.nextInt();
                        if ((percentuale > 0) && (percentuale < 101)) {
                            cloneModif.setAvanzLettura(percentuale);
                            break;
                        } else {
                            System.out.println("L'avanzamento di lettura deve essere compreso tra 1 e 100.");
                            break;
                        }
                    }
                    case 3: {
                        esc = true;
                        break;
                    }
                    default: {
                        System.out.println("Non ho capito, riprova.");
                        break;
                    }
                }
            }
            Biblioteca.aggiorna(cloneModif);
        } else {
            System.out.println("L'ID specificato non corrisponde a nessun libro nella biblioteca");
        }
    }
    public static void visualizzaLibri() {
        List<Libro> lista = Biblioteca.getListLibri();
        for (Libro l : lista) {
            System.out.println(l.prettyPrint());
        }
    }
}
