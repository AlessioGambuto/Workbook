package ires.corso.parttwo.exercises;

import ires.corso.parttwo.exercises.corsiStudenti.*;

import java.util.HashMap;
import java.util.Map;


public class CorsiStudentiTest {

    public static void main(String[] args) {
        // 1. Studenti e corsi
        //
        //    Creare le seguenti classi:
        //    - Student (nome, cognome, codiceStudente, tutti String)
        //    - Course (titolo, descrizione, settore)
        //    - Assignment (titolo, descrizione)
        //
        //    Create anche i dati sdi almeno:
        //    - 3 studenti
        //    - 3 corsi
        //    - un corso ha 2 o + assignment, ciascun studente esegue tutti gli assignment ricevendo un voto da 1 a 10
        //
        //    Caricate tutti i dati in un'unica collection, organizzata in modo da poter contenere tutti i voti presi
        //    da ciascuno studente.
        //
        //    Calcolate con questa struttura:
        //    - la media dei voti di ciascun studente in ciascun corso (come è andato ciascun studente in un corso?)
        //    - la media dei voti di tutti gli studenti in ciascun assignment (quanto è difficile per gli studenti
        //      un certo assignment?)

        Student stud1 = new Student("ABC1", "Rossi", "Mario");
        Student stud2 = new Student("ABC2", "Biondi", "Luigi");
        Student stud3 = new Student("ABC3", "Cesare", "Giulio");

        Course corso1 = new Course("Programmazione Java", "Corso di programmazione col linguaggio Java", "Informatica");
        Course corso2 = new Course("Cucina Vegetariana", "Corso di cucina vegetariana", "Gastronomia");
        Course corso3 = new Course("Lavorare il legno", "Corso sull'utilizzo degli strumenti necessari a lavorare il legno","Artigianato");

        Assignment es1Corso1 = new Assignment("Generics", "Esercizio sui generics");
        Assignment es2Corso1 = new Assignment("Collections", "Esercizio sulle collections");
        Assignment es1Corso2 = new Assignment("Pizza vegetariana", "Cucinare una pizza vegetariana");
        Assignment es2Corso2 = new Assignment("Primo vegetariano", "Cucinare un primo piatto vegetariano");
        Assignment es1Corso3 = new Assignment("Sega circolare", "Esercitazione sulla sega circolare");
        Assignment es2Corso3 = new Assignment("Pialla elettrica", "Esercitazione sulla pialla elettrica");


        Map <Student, Map > studentMap = new HashMap<>();
        Map <Course, Assignment> courseAssignment = new HashMap<>();
        courseAssignment.put(corso1,es1Corso1);
        courseAssignment.put(corso1,es2Corso1);


    }

}
