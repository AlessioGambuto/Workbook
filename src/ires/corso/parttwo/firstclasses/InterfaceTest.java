package ires.corso.parttwo.firstclasses;
import ires.corso.parttwo.firstclasses.characters.*;

public class InterfaceTest {
    public static void main (String[] args) {
        Eroe gigi = new Eroe();
        Licantropo lorenzo = new Licantropo(true);
        Vampiro arturo = new Vampiro();
        for (int i = 0; i < 3; i++) {
            gigi.combatti();
            lorenzo.combatti();
            lorenzo.azzanna();
            arturo.azzanna();
            System.out.println(gigi.getForza());
            System.out.println(lorenzo.getForza());
            System.out.println(arturo.getForza());
        }
    }
}
