package ires.corso.parttwo.firstclasses;

public class Caffe {
    private String specie;
    private String zonaProduzione;
    private int mesiTostatura;
    private boolean altarichiesta;

    public Caffe(String specie, String zonaProduzione, int mesiTostatura, boolean altarichiesta){
        this.specie = specie;
        this.zonaProduzione = zonaProduzione;
        this.mesiTostatura = mesiTostatura;
        this.altarichiesta = altarichiesta;
    }

    public void prettyPrint() {
        String report;
        if (this.altarichiesta) {
            report = "Il caffè " + this.specie + " è prodotto in " + this.zonaProduzione + " viene tostato per " + mesiTostatura + " mesi ed è una varietà con un alta richiesta nel mercato.";
        } else {
            report = "Il caffè " + this.specie + " è prodotto in " + this.zonaProduzione + " viene tostato per " + mesiTostatura + " mesi ed è una varietà con una bassa richiesta nel mercato.";
        }
        System.out.println(report);
    }

    public String getSpecie() {
        return specie;
    }

    public String getZonaProduzione() {
        return zonaProduzione;
    }

    public int getMesiTostatura() {
        return mesiTostatura;
    }

    public boolean isAltarichiesta() {
        return altarichiesta;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void setZonaProduzione(String zonaProduzione) {
        this.zonaProduzione = zonaProduzione;
    }

    public void setMesiTostatura(int mesiTostatura) {
        this.mesiTostatura = mesiTostatura;
    }

    public void setAltarichiesta(boolean altarichiesta) {
        this.altarichiesta = altarichiesta;
    }
}
