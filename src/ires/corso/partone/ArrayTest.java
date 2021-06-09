package ires.corso.partone;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("Inserisci un array (numeri separati da uno spazio, esempio: 1 2 3 ...)");
        System.out.print("==>");
        Scanner in = new Scanner(System.in);
        String nl = in.nextLine();
        String[] strArr = nl.split(" ");

        int[] intArr = new int[strArr.length];

        for (int j = 0; j < strArr.length; j++) {
            System.out.printf("Elemento %d-esimo dell'array ==> %s\n", j + 1, strArr[j]);
            intArr[j] = Integer.parseInt(strArr[j]);
        }

        System.out.print("Dimmi l'elemento da cercare: ");
        int j = in.nextInt();
        elemPositionInArray(intArr, j);
    }

    public static void elemPositionInArray(int[] intArray, int elem) {
        boolean trovato = false;
        for (int i=0; i<intArray.length; i++){
            if (intArray[i]==elem){
                trovato = true;
                int position = i+1;
                System.out.println("L'elemento si trova alla posizione dell'array n° " + position);
                break;
            }
        }
        if (!trovato){
            System.out.println("Non ho trovato l'elemento inserito nell'array");
        }
    }
}
