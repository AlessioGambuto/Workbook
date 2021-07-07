package ires.corso.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca implements Serializable{

    public static long idSeed;
    public static boolean init = false;
    private static String fileName;
    protected static Biblioteca repository = null;

    public static boolean init(String fileName) {
        try {
            Path p = Paths.get(fileName);
            fileName = p.toString();
            init = true;
        } catch (InvalidPathException ipe) {
            System.out.println(ipe.getMessage());
        }
        return init;
    }

    public static Biblioteca getBiblioteca() throws Exception {
        if (!init) {
            throw new Exception("La biblioteca non è stata inizializzata");
        }
        if (repository == null) {
            if (!Files.exists(Paths.get(fileName))) {
                repository = new Biblioteca();
            }
            else {
                loadFromFile();
            }
        }
        return repository;
    }

    public static void loadFromFile() throws IOException, ClassNotFoundException {
        try (FileInputStream file = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(file);) {
            repository = (Biblioteca) in.readObject();
        }
    }

    public void writeToFile(String fileName) throws IOException {
        try (FileOutputStream file = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(repository);
        }
    }

    public static Biblioteca getBibliotecaRepo() {
        if(repository==null)
            repository = new Biblioteca();
        return repository;
    }

    public static long getNewId() {
        return ++idSeed;
    }

    public Map<Long, Libro> mapLibri = new HashMap<>();

    public static void aggiungi(Libro l) {
        long id = getNewId();
        l.setId(id);
        repository.mapLibri.put(id, l);
    }

    public static void aggiorna(Libro l) {
        long id = l.getId();
        repository.mapLibri.put(id, l);
    }

    public static void rimuovi(long id) {
        repository.mapLibri.remove(id);
    }

    public static boolean containsId(long id) {
        return repository.mapLibri.containsKey(id);
    }

    public static Libro getLibroById(long id) {
        return repository.mapLibri.get(id);
    }

    public static boolean libroCompletato(Libro l){
        boolean completato = false;
        int percentuale = l.getAvanzLettura();
        if (l.getAvanzLettura()==100){
            completato = true;
        }
        return completato;
    }

    public static List<Libro> getListLibri() {
        ArrayList<Libro> listLibri = new ArrayList<>();
        listLibri.addAll(repository.mapLibri.values());
        return listLibri;
    }
}
