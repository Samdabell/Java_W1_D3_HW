package example.codeclan.com.godzilla;

import static android.R.attr.value;

public abstract class Kaiju {

    private String name;
    private int healthValue;
    private int destructiveForce;

    public Kaiju(String name, int healthValue, int destructiveForce) {
        this.name = name;
        this.healthValue = healthValue;
        this.destructiveForce = destructiveForce;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getDestructiveForce() {
        return destructiveForce;
    }










}