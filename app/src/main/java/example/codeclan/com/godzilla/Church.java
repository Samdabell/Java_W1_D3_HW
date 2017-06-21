package example.codeclan.com.godzilla;

/**
 * Created by Sam on 21/06/2017.
 */

public class Church extends HumanConstructs implements Destroyable {

    public Church(String type, int healthValue){
        super(type, healthValue);
    }

    public String destroy(){
        return "Creeeaaaaakkkkk";
    }

    public void attack(Kaiju kaiju) {
        this.healthValue -= kaiju.getDestructiveForce();
        if (healthValue < 0) {
            destroy();
        }
    }
}
