package ires.corso.parttwo.firstclasses.firstclasses;

public class Automobile {
    private String marca;
    private String modello;
    private int cilindrata;
    private boolean accesa;

    private Automobile(String marca, String modello, int cilindrata, boolean accesa){
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.accesa = accesa;
    }

    public static Automobile nuovaAutomobile(String marca, String modello, int cilindrata, boolean accesa){
        return new Automobile(marca, modello, cilindrata, accesa);
    }

    public void prettyPrint() {
        String report;
        if (this.accesa) {
            report = "L'auto è di marca: " + this.marca + ", di modello: " + this.modello + ", di cilindrata: " + this.cilindrata + " ed è accesa.";
        }
        else {
            report = "L'auto è di marca: " + this.marca + ", di modello: " + this.modello + ", di cilindrata: " + this.cilindrata + " ed è spenta.";
        }
        System.out.println(report);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setAccesa(boolean accesa) {
        this.accesa = accesa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public boolean isAccesa() {
        return accesa;
    }
}