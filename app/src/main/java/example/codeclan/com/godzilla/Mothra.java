package example.codeclan.com.godzilla;

/**
 * Created by Sam on 21/06/2017.
 */

public class Mothra extends Kaiju implements Attack {

    public Mothra(String name, int healthValue, int destructiveForce) {
        super(name, healthValue, destructiveForce);
    }

    public String roar(){
        return "FLAP!!";
    }
}
