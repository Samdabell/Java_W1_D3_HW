package example.codeclan.com.godzilla;

public abstract class HumanConstructs {

    private String type;
    public int healthValue;

    public HumanConstructs(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

}
