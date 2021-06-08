package ires.corso.partone;

import java.util.Scanner;

public class DiamondOfNumbers {
    /*
    VARIAZIONE:
          1
         212
        32123
       4321234
      543212345
     65432123456
    7654321234567
     65432123456
      543212345
       4321234
        32123
         212
          1
 */
    public static void main(String[] args) {
        System.out.println("Inserisci il n°: ");
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int i;

        for (i = 1; i <= d; i++) {
            disegnaDiamante(i, d);
        }

        for (i = d - 1; i >= 1; i--) {
            disegnaDiamante(i, d);
        }
    }
    public static void disegnaDiamante(int posizione, int dimensione) {
        int spazi = dimensione - posizione;
        disegnaLineaDiamante(spazi, posizione);
    }
        public static void disegnaLineaDiamante(int nSpazi, int indice) {
        int j;
            for(j = 1; j <= nSpazi; j++) {
                System.out.print(" ");
            }
            // Stampo i numeri decrescenti
            for (j = indice; j > 0; j--) {
                System.out.print(j);
            }
            // Stampo i numeri crescenti
            for(j = 2; j <= indice; j++) {
                System.out.print(j);
            }
        System.out.print("\n");
    }
    }