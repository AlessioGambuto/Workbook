package ires.corso.parttwo.firstclasses;

import ires.corso.parttwo.firstclasses.geometric.*;

public class GeometricShapeTest {
    // ...dovete riscrivere in versione OOP (object oriented programming)
    // il programma che calcolava le aree di triangolo, trapezio, quadrato:
    // 1. Create una classe "MasterShape" che sarà la classe "parent"
    // 2. all'interno di "MasterShape" definite il metodo computeArea
    //    e il metodo il metodo computePerimeter, che NON devono ricevere
    //    argomenti in input: questi metodi devono restituire 0.0
    // 3. Usate i costruttori specifici delle classi figlie per richiedere
    //    al momento della creazione i parametri che servono per fare i
    //    calcoli in ciascuna forma geometrica
    // 4. Le classi figle (Trapezio, Triangolo, Quadrato) devono ESTENDERE
    //    (con "extends") la MasterShape e implementare l'OVERRIDE dei metodi
    //    computeArea e computePerimeter (nota: aggiungere l'annotation @Override)
    // 5. Create una classe Tester con il metodo main(String[] args), all'interno
    //    del quale dovrete:
    //    - creare 3 forme geometriche diverse, come istanze delle classi figlie: chiedete
    //      i dati in input nel metodo main e salvateli nelle proprietà interne
    //      di ciascuna classe
    //    - creare un array di MasterShape che avrà come elementi le istanze create
    //    - calcolare le aree e stamparle in un unico loop (come "ilConto")
public static void main(String [] args){

    Square sq1 = new Square();
    Triangle tr1 = new Triangle();
    Trapezium trap1 = new Trapezium();

    MasterShape[] shapes = new MasterShape[3];
    shapes[0] = (MasterShape) sq1;
    shapes[1] = (MasterShape) tr1;
    shapes[2] = (MasterShape) trap1;

    for (int i=0; i<shapes.length; i++){
        shapes[i].computePerimeter();
        shapes[i].computeArea();
    }
}


}
