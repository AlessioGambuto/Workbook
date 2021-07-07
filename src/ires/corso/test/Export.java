package ires.corso.test;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class Export {

    public static void exportToFile() throws Exception {
        String fileName = "Export.txt";
        try (PrintWriter outputStream = new PrintWriter(new FileWriter(fileName))) {
            List<Libro> libroList = Biblioteca.getBibliotecaRepo().getListLibri();
            Iterator<Libro> lli = libroList.iterator();

            while (lli.hasNext()) {
                String stringLibro = convertToString(lli.next());
                outputStream.println(stringLibro);
            }
        }
    }

    private static String convertToString(Libro l) {
        String s = l.getId() + "," +
                l.getTitolo() + ", " +
                l.getAutore() + ", " +
                l.getSinossi() + ", " +
                l.getIsbn() + ", " +
                l.getDataPubblicazione() + ", " +
                l.getGenere() + ", " +
                l.getGradimento() + ", " +
                l.getAvanzLettura() + ".";
        return s;
    }
}