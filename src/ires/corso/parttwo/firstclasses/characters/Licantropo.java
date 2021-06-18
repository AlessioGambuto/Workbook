package ires.corso.parttwo.firstclasses.characters;

public class Licantropo
        implements Umano, Mostro {

    private boolean isFormaUmana;
    protected int forzaUmano, forzaMostro;

    public Licantropo(boolean luna) {
        this.isFormaUmana = !luna;
        if (luna) {
            this.forzaMostro = 15;
            this.forzaUmano = 0;
        } else {
            this.forzaUmano = 10;
            this.forzaMostro = 0;
        }
    }

    @Override
    public void azzanna() {
        if (!this.isFormaUmana) {
            this.forzaMostro = this.forzaMostro - 2;
        }
    }

    @Override
    public void combatti() {
        if (this.isFormaUmana) {
            this.forzaUmano = this.forzaUmano - 3;
        }
    }

    @Override
    public String getForza() {
        String forzaResidua = "La forza rimanente del licantropo come umano è: " + forzaUmano + " mentro come mostro è: " + forzaMostro;
        return forzaResidua;
    }
}