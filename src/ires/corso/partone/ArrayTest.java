package ires.corso.partone;

import com.sun.deploy.security.SelectableSecurityManager;

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
        int p = elemPositionInArray(intArr, j);
        System.out.printf("L'elemento si trova nella posizione %d\n", p);

        int [] arraySenzaDuplicati = removeDuplicates(intArr);
        for (int s=0; s<arraySenzaDuplicati.length-1;s++){
            System.out.println(arraySenzaDuplicati[s]);
        }
    }
    public static int elemPositionInArray(int[] intArray, int elem) {
        int thereIs = -1;
        for (int i=0; i<intArray.length; i++){
            if (intArray[i]==elem){
                thereIs = i;
                break;
            }
        }
        return thereIs;
    }
    public static int[] removeDuplicates(int[] arrayWithDuplicates) {
        boolean[] isduplicated = new boolean[arrayWithDuplicates.length];
        int nd = 0;

        for (int i = arrayWithDuplicates.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
                    isduplicated[i] = true;
                    break;
                } else
                    isduplicated[i] = false;
            }
        }
        for (int k = 0; k < isduplicated.length; k++){
            if (!isduplicated[k]) {
                nd++;
            }
        }
        int [] arrayWithoutDuplicates = new int[nd+1];
        int cont = 0;
        for (int k=0; k<arrayWithDuplicates.length; k++){
            if (!isduplicated[k]){
                arrayWithoutDuplicates[cont]=arrayWithDuplicates[k];
                cont++;
                }
            }
        return arrayWithoutDuplicates;
    }
}
