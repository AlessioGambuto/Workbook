package ires.corso.partone;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        int j;
        int maggiore;
        String posizione;
        for(int i=0; i<3; i++) {
            j = i+1;
            System.out.println("Inserisci il " + j + "° numero:");
            a[i] = in.nextInt();
        }

        if (a[0] > a[1]) {
            if (a[0]>a[2]) {
                maggiore = a[0];
                posizione = "primo";

            }
            else {
                maggiore = a[2];
                posizione = "terzo";
            }
        }
        else {
            if (a[1]> a[2]){
                maggiore = a[1];
                posizione = "secondo";
            }
            else{
                maggiore = a[2];
                posizione = "terzo";
            }
            System.out.println("Il n° maggiore inserito è il " + posizione + " e vale: " + maggiore);
        }
    }
}
