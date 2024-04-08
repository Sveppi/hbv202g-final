package is.hi.hbv202g.finalass;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class contains unit tests for the Navigation class.
 */
public class NavigationTest {

    /**
     * Test case for the getMainChoices method.
     * It verifies that the returned main choices array matches the expected array.
     */
    @Test
    public void testGetMainChoices() {
        String[] expectedMainChoices = { "nyjan", "vista", "skoda", "haetta" };
        Assert.assertArrayEquals(expectedMainChoices, Navigation.getMainChoices());
    }

    /**
     * Test case for the getFavChoices method.
     * It verifies that the returned favorite choices array matches the expected array.
     */
    @Test
    public void testGetFavChoices() {
        String[] expectedFavChoices = { "baka", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        Assert.assertArrayEquals(expectedFavChoices, Navigation.getFavChoices());
    }

}