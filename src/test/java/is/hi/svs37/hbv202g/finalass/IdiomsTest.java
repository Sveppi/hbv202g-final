package is.hi.svs37.hbv202g.finalass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * This class contains unit tests for the Idioms class.
 */
public class IdiomsTest {

    private Idioms idioms;

    /**
     * Sets up the test environment by creating an instance of the Idioms class.
     */
    @Before
    public void setUp() {
        idioms = new Idioms();
    }

    /**
     * Tests that the idiom collection is not null.
     */
    @Test
    public void testIdiomCollectionNotNull() {
        assertNotNull(Idioms.idiomCollection);
    }

    /**
     * Tests that the idiom collection has the expected size.
     */
    @Test
    public void testIdiomCollectionSize() {
        assertEquals(828, Idioms.idiomCollection.length);
    }

    /**
     * Tests that the idiom at index zero is correct.
     */
    @Test
    public void testIdiomAtIndexZero() {
        assertEquals("Aldur og sótt koma brátt í bú", Idioms.idiomCollection[0]);
    }
    
}