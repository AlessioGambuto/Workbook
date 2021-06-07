package ires.corso.partone;

import ires.corso.partone.geometric.Quadrato;
import ires.corso.partone.geometric.Triangolo;
import ires.corso.partone.geometric.Trapezio;
import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Per quale figura vuoi calcolare l'area?");
        String input = in.nextLine();
        String shape = input.toLowerCase();
        double area;

        switch(shape){
            case "quadrato":
                in = new Scanner(System.in);
                System.out.println("Inserisci la misura del lato del quadrato:");
                double l = in.nextDouble();
                area = Quadrato.computeArea(l);
                System.out.println("L'area del quadrato è: "+ area);
                break;

            case "triangolo":
                System.out.println("Inserisci la misura della base del triangolo:");
                double b = in.nextDouble();
                System.out.println("Inserisci la misura dell'altezza del triangolo:");
                double h = in.nextDouble();
                area = Triangolo.computeArea(b, h);
                System.out.println("L'area del triangolo è: "+ area);
                break;

            case "trapezio":
                in = new Scanner(System.in);
                System.out.println("Inserisci la misura della base minore del trapezio:");
                double bmin = in.nextDouble();
                System.out.println("Inserisci la misura della base maggiore del trapezio:");
                double bmaj = in.nextDouble();
                System.out.println("Inserisci la misura dell'altezza del trapezio:");
                double height = in.nextDouble();
                area = Trapezio.computeArea(bmin, bmaj, height);
                System.out.println("L'area del trapezio è: "+ area);
                break;

            default:
                System.out.println("Figura non valida");
        }
    }
}