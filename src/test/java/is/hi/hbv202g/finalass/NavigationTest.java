package is.hi.hbv202g.finalass;

import org.junit.Assert;
import org.junit.Test;

public class NavigationTest {

    @Test
    public void testGetMainChoices() {
        String[] expectedMainChoices = { "nyjan", "vista", "skoda", "haetta" };
        Assert.assertArrayEquals(expectedMainChoices, Navigation.getMainChoices());
    }

    @Test
    public void testGetFavChoices() {
        String[] expectedFavChoices = { "baka", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        Assert.assertArrayEquals(expectedFavChoices, Navigation.getFavChoices());
    }

}