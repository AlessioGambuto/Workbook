package ires.corso.parttwo.todo;

// GRUPPO 3:

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// GRUPPO 3:
public class ToDoImportExport
{
    private static String convertToString(ToDo t) {
        String s = t.getId() + ";" + t.getTitolo() + ";" + t.getDescrizione() + ";" + t.getDataCreazione() + ";" + t.getDataConsegna() + ";" + t.getPriorita() + ";" + t.getStato();
        return s;
    }

    public static void exportToFile() throws Exception
    {
        // Chiuede all'utente un nome file di export...
        String fileName = "FILE INSERITO DA UTENTE";
        try (PrintWriter outputStream = new PrintWriter(new FileWriter(fileName)))
        {
            List<ToDo> toDoList = ToDoRepository.getRepo().getToDoList();
            Iterator<ToDo> tdi = toDoList.iterator();

            while (tdi.hasNext()) {
                String sToDo = convertToString(tdi.next());
                outputStream.println(sToDo);
            }
        }
    }

    public static void importToFile() throws IOException {
        // Chiede all'utente un nome file di import...
        String fileName = "FILE INSERITO DA UTENTE";
        ArrayList<String> fileLines = new ArrayList<>();

        try (BufferedReader inputStream = new BufferedReader(new FileReader(fileName))) {
            String l;
            while ((l = inputStream.readLine()) != null) {
                fileLines.add(l);
            }
        }

        // Loop di conversione da stringhe (linee file) a oggetti TO-DO
        // 1: conversione da linea del file a array di stringhe
        // 2: loop in cui:
        //    - si validano i campi (es. titolo non nullo, descriizone non nulla...)
        //    - si invoca il costruttore di ToDo passando i dati
        //     - Repository.add()
        // 3. Se qualcosa va male ==> output su schermop ("Ho saltato una riga per nome nullo...")
        // 4. alla fine: ho importato XYZ nuovi TOOD
    }
}
