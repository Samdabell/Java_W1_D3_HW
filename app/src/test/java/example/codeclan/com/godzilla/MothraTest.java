package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 21/06/2017.
 */

public class MothraTest {

    Mothra mothra;

    @Before
    public void before(){
        mothra = new Mothra("Betty", 75, 40);
    }

    @Test
    public void hasName(){
        assertEquals("Betty", mothra.getName());
    }

    @Test
    public void canRoar(){
        assertEquals("FLAP!!", mothra.roar());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(mothra.getHealthValue(), 75);
    }

    @Test
    public void canGetDestructiveForce(){
        assertEquals(mothra.getDestructiveForce(), 40);
    }

}
