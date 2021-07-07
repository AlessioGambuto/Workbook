package ires.corso.partthree;
import java.util.*;
import java.util.stream.IntStream;

public class LambdaTest {
    // 1. Data una lista di nomi (Agnese, Stefano, Niki, GabrieleM, Davide, GabrieleG, Alessandro, Alberto, Fabiola, Veronica, Alessio, Daniele):
    // partire con un ArrayList che li contiene;
    // trasformarlo in stream
    // filtrare (escludendo) i nomi che hanno lunghezza < di 5 lettere
    // trasformare con UpperCase i rimanenti
    // stamparli su schermo
    // … concatenando il più possibile le varie operazioni

    // 2. Fare un programma Java che:
    // chiede all’utente una lista di numeri (separati da virgola) ⇒ codice SortingGame, o split Stringa
    // li trasforma in stream
    // filtra i duplicati (HINT: guardate bene i metodi dell’interfaccia Stream)
    // eleva al quadrato i numeri filtrati
    // calcola la media (HINT: operazione terminale chiamata “average”)

    public static void main(String[] args) {
        List<String> listaNomi = Arrays.asList("Agnese", "Stefano", "Niki", "GabrieleM", "Davide", "GabrieleG", "Alessandro", "Alberto", "Fabiola", "Veronica", "Alessio", "Daniele");
        listaNomi.stream().filter(s -> s.length() > 5).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci una lista di numeri separati dalla virgola: ");
        String input = in.nextLine();
        String[] str = input.split(",");
        List<Integer> listInt = new ArrayList<Integer>();
        for (String s : str) {
            Integer n = Integer.parseInt(s);
            listInt.add(n);
        }
/* da rivedere
        IntStream prova = IntStream.of(listInt);
        listInt.stream().distinct().map(i -> i * i).forEach(i -> System.out.println(i));
 */
    }
}
