package ires.corso.parttwo.firstclasses.geometric;

public class Square extends MasterShape {
    private double side;

    public Square(){
        do {
            System.out.println("Inserisci la lunghezza del lato del quadrato: ");
            this.side = in.nextDouble();
        }while(!isValid());
    }

    @Override
    public double computeArea(){
        this.area = this.side*this.side;
        System.out.println("L'area del quadrato è: " + this.area);
        return area;
    }

    @Override
    public double computePerimeter(){
        this.perimeter = this.side*4;
        System.out.println("Il perimetro del quadrato è " + this.perimeter);
        return perimeter;
    }

    @Override
    protected boolean isValid() {
        boolean isCheckValid = false;
        String error = "Il quadrato inserito non è valido, riprova. (Il lato deve essere maggiore di 0)";
        if (this.side <= 0) {
            System.out.println(error);
        } else {
            isCheckValid = true;
        }
        return isCheckValid;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
