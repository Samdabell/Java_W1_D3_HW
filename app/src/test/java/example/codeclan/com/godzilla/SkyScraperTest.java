package example.codeclan.com.godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class SkyScraperTest {
    Skyscraper skyscraper;
    Godzilla godzilla;


    @Before
    public void before(){
        skyscraper = new Skyscraper("building", 30);
        godzilla = new Godzilla("Gary", 100, 50);
    }


    @Test
    public void hasType(){
        assertEquals("building", skyscraper.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(30, skyscraper.getHealthValue());
    }

    @Test
    public void canBeDestroyed(){
        assertEquals("Kabooooooooom", skyscraper.destroy());
    }

    @Test
    public void canBeAttacked(){
        skyscraper.attack(godzilla);
        assertEquals(-20, skyscraper.getHealthValue());
    }
}
