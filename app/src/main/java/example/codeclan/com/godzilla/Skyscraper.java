package example.codeclan.com.godzilla;

/**
 * Created by Sam on 21/06/2017.
 */

class Skyscraper extends HumanConstructs implements Destroyable {

    public Skyscraper(String type, int healthValue){
        super(type, healthValue);
    }

    public String destroy(){
        return "Kabooooooooom";
    }

    public void attack(Kaiju kaiju){
        this.healthValue -= kaiju.getDestructiveForce();
        if (healthValue < 0) {
            destroy();
        }
    }
}
