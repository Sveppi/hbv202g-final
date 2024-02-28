package is.hi.hbv202g.finalass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class IdiomsTest {

    private Idioms idioms;

    @Before
    public void setUp() {
        idioms = new Idioms();
    }

    @Test
    public void testIdiomCollectionNotNull() {
        assertNotNull(Idioms.idiomCollection);
    }

    @Test
    public void testIdiomCollectionSize() {
        assertEquals(828, Idioms.idiomCollection.length);
    }

    @Test
    public void testIdiomAtIndexZero() {
        assertEquals("Aldur og sótt koma brátt í bú", Idioms.idiomCollection[0]);
    }

    // Add more tests for other methods or functionality of the Idioms class

}