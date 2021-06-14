package ires.corso.parttwo.firstclasses.geometric;

import java.util.Arrays;

public class Triangle extends MasterShape {
    private double base;
    private double side1;
    private double side2;

    public Triangle () {
        do {
            System.out.println("Inserisci la lunghezza della base del triangolo: ");
            this.base = in.nextDouble();
            System.out.println("Inserisci la lunghezza del 1° lato del triangolo: ");
            this.side1 = in.nextDouble();
            System.out.println("Inserisci la lunghezza del 2° lato del triangolo: ");
            this.side2 = in.nextDouble();
        } while(!isValid());
    }

    @Override
    protected boolean isValid(){
        boolean isCheckValid = false;
        String error = "Il triangolo inserito non è valido, riprova.(I 3 lati devono essere maggiori di 0 e la lunghezza del lato maggiore deve essere inferiore alla somma della lunghezza dei lati minori.)";
        double[] parameters = {this.base, this.side1, this.side2};
        Arrays.sort(parameters);
        for (int i=0; i<parameters.length; i++){
            if (parameters[i]<=0){
                System.out.println(error);
                return isCheckValid;
            }
        }
        if (parameters[2]>(parameters[0]+parameters[1])){
            System.out.println(error);
        }
        else {
            isCheckValid = true;
        }
        return isCheckValid;
    }

    @Override
    public double computeArea() {
        double semiPerimeter = (this.base+this.side1+this.side2)/2;
        this.area = Math.sqrt(semiPerimeter*(semiPerimeter-this.base)*(semiPerimeter-this.side1)*(semiPerimeter-this.side2)); //√[s(s-a)(s-b)(s-c)]
        System.out.println("L'area del triangolo è: " + this.area);
        return area;
    }

    @Override
    public double computePerimeter() {
        this.perimeter=this.base+this.side1+this.side2;
        System.out.println("Il perimetro del triangolo è: " + this.perimeter);
        return perimeter;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
}