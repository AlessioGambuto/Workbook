package ires.corso.parttwo.firstclasses.characters;

public class Eroe
        implements Umano{

    protected int forza;

    public Eroe(){
        this.forza = 10;
    }

    @Override
    public void combatti(){
        this.forza = this.forza -3;
    }

    @Override
    public String getForza(){
        String forzaResidua = "La forza rimanente dell'eroe è: " + this.forza;
        return forzaResidua;
    }
}
