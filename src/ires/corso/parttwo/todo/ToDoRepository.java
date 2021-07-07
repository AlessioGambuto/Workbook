package ires.corso.parttwo.todo;

import com.sun.corba.se.spi.activation._RepositoryImplBase;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoRepository implements Serializable {
    private static boolean _init = false;               // flag che indica se il ToDoRepository è stato inizializzato
    private static String _fileName;                    // file da usare per serializzazione/deserializzazione
    private static ToDoRepository _repository = null;   // unica istanza del repository;

    // Inizializzazione: imposta file di serializzazione
    public static boolean init(String fileName) {
        try {
            Path p = Paths.get(fileName);
            _fileName = p.toString();
            _init = true;
        } catch (InvalidPathException ipe) {
            System.out.println(ipe.getMessage());
        }
        return _init;
    }

    // Singleton pattern: carica da file e restituisce sempre la stessa istanza
    public static ToDoRepository getRepo() throws Exception {
        if (!_init) {
            throw new Exception("ToDo Repository has not been initialized");
        }
        if (_repository == null) {
            if (!Files.exists(Paths.get(_fileName)))
                _repository = new ToDoRepository();
            else
                loadFromFile();
        }
        return _repository;
    }

    // Deserializza l'istanza del ToDoRepository da file
    private static void loadFromFile() throws IOException, ClassNotFoundException {
        try (FileInputStream file = new FileInputStream(_fileName);
             ObjectInputStream in = new ObjectInputStream(file);) {
            _repository = (ToDoRepository) in.readObject();
        }
    }

    // METODI E MEMBRI DI ISTANZA
    Map<Long, ToDo> _data = new HashMap<>();    // Mappa ID -> TO-DO
    private long _idSeed;                       // Contatore per la generazione degli id

    // Costruttore privato
    private ToDoRepository() {
    }

    // Utilizzato per generare un nuovo ID
    public long getNewId() {
        _idSeed++;
        return _idSeed;
    }

    // Eliminazione di un TO-DO
    public static void delete(Long ID) {
        _repository._data.remove(ID);
    }

    // Aggiunta di un TO-DO
    public static void add(ToDo t) {
        long newId = _repository.getNewId();
        t.setId(newId);
        _repository._data.put(newId, t);
    }

    // Modifica di un un TO-DO
    public static void update(ToDo t) {
        _repository._data.put(t.getId(), t);
    }
    public static ToDo getById(long Id) {
        ToDo todo = _repository._data.get(Id);
        return todo;
    }

    // Restituisce una lista di tutti i TO-DO
    public List<ToDo> getToDoList() {
        ArrayList<ToDo> toDos = new ArrayList<ToDo>(_repository._data.values());
        return toDos;
    }

    // Salvataggio su file
    public void writeToFile(String fileName) throws IOException {
        try (FileOutputStream file = new FileOutputStream(_fileName);
             ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(_repository);
        }
    }
}