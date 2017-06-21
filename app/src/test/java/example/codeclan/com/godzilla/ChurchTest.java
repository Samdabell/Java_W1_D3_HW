package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 21/06/2017.
 */

public class ChurchTest {

    Church church;
    Mothra mothra;

    @Before
    public void before(){
        church = new Church("building", 50);
        mothra = new Mothra("Betty", 75, 40);
    }

    @Test
    public void hasType(){
        assertEquals("building", church.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(50, church.getHealthValue());
    }

    @Test
    public void canBeDestroyed(){
        assertEquals("Creeeaaaaakkkkk", church.destroy());
    }

    @Test
    public void canBeAttacked(){
        church.attack(mothra);
        assertEquals(10, church.getHealthValue());
    }
}
