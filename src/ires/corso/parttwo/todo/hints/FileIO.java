package ires.corso.parttwo.todo.hints;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    // I/O
    public static void main(String[] args)
    {
        System.out.println("Inizio programma di I/O");
        try {
            copyLines(); // <== UTILIZZIAMO QUESTO COME "VECCHIO INPUT"
        }
        catch(Exception e) {
            System.out.println("Si è verificata un'eccezione...");
        }
        System.out.println("Fine del programma");
    }

    // Usando oggetti "buffered" che ragionano per linee di testo...
    public static void copyLines() throws IOException
    {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("lines.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                System.out.println(l);
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    /* Java NIO - non-blocking reading  */
    public static void readNIOFile() throws IOException {
        BufferedReader reader = null;
        try {
            Path inputFile = Paths.get("xanadu.txt");
            reader = Files.newBufferedReader(inputFile, Charset.defaultCharset());
            String lineFromFile = "";
            while ((lineFromFile = reader.readLine()) != null) {
                System.out.println(lineFromFile);
            }
        } catch (IOException e){
            System.out.println(e);
        } finally {
            if(reader != null)
                reader.close();
        }
    }

    /* Java NIO - non-blocking writing */
    public static void writeFile() throws IOException {
        BufferedWriter writer = null;
        try {
            Path outputFile = Paths.get("niooutput.txt");
            writer = Files.newBufferedWriter(outputFile, Charset.defaultCharset());
            StringBuilder message = new StringBuilder("This is a message going into the file.");
            writer.append(message);
        } catch (IOException e){
            System.out.println(e);
        } finally {
            if(writer != null)
                writer.close();
        }
    }
}
