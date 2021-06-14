package ires.corso.parttwo.firstclasses.geometric;

public class Trapezium extends MasterShape {
    private double side1;
    private double side2;
    private double bmaj;
    private double bmin;

    public Trapezium(){
        do{
            System.out.println("Inserisci la lunghezza della base maggiore del trapezio: ");
            this.bmaj = in.nextDouble();
            System.out.println("Inserisci la lunghezza della base minore del trapezio: ");
            this.bmin = in.nextDouble();
            System.out.println("Inserisci la lunghezza del 1° lato del trapezio: ");
            this.side1 = in.nextDouble();
            System.out.println("Inserisci la lunghezza del 2° lato del trapezio: ");
            this.side2 = in.nextDouble();
        }while(!isValid());
    }

    @Override
    protected boolean isValid() {
        boolean isCheckValid = false;
        String error = "Il trapezio inserito non è valido, riprova.(Basi e lati devono essere maggiori di 0)";
        double[] parameters = {this.side1, this.side2, this.bmaj, this.bmin};
        for (int i=0; i<parameters.length; i++){
            if (parameters[i]<=0){
                System.out.println(error);
            }
            else{
                isCheckValid = true;
            }
        }
        return isCheckValid;
    }

    @Override
    public double computeArea() {
        double diffB = this.bmaj-this.bmin;
        double trSemiPerimeter = (diffB+this.side1+this.side2)/2;
        double trArea = Math.sqrt(trSemiPerimeter*(trSemiPerimeter-diffB)*(trSemiPerimeter-this.side1)*(trSemiPerimeter-this.side2));
        double height= (trArea*2)/diffB;
        this.area = ((bmaj+bmin)*height)/2;
        System.out.println("L'area del trapezio è: " + this.area);
        return area;
    }

    @Override
    public double computePerimeter() {
        this.perimeter=this.bmaj+this.bmin+this.side1+this.side2;
        System.out.println("Il perimetro del trapezio è: " + this.perimeter);
        return perimeter;
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

    public double getBmaj() {
        return bmaj;
    }

    public void setBmaj(double bmaj) {
        this.bmaj = bmaj;
    }

    public double getBmin() {
        return bmin;
    }

    public void setBmin(double bmin) {
        this.bmin = bmin;
    }
}
