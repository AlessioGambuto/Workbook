package ires.corso.parttwo.firstclasses.characters;

public class Vampiro
        implements Mostro{

    protected int forza;

    public Vampiro(){
        this.forza = 15;
    }

    @Override
    public void azzanna(){
        this.forza = this.forza - 2;
    }

    @Override
    public String getForza(){
        String forzaResidua = "La forza rimanente del Vampiro è: " + this.forza;
        return forzaResidua;
    }
}
