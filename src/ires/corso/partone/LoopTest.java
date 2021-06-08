package ires.corso.partone;
import java.util.Scanner;
public class LoopTest {
    public static void main(String[] args) {
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10

        System.out.println("Inserisci il n° di righe: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j;
        int cont = 1;
        for (i=0; i<=n; i++){
            for (j=0; j<i; j++){
                System.out.print(cont+ " ");
                cont= cont+1;
            }
            System.out.println("");
        }

    }
}
