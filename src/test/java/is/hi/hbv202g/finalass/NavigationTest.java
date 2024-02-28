package is.hi.hbv202g.finalass;

import org.junit.Assert;
import org.junit.Test;

public class NavigationTest {

    @Test
    public void testGetMainChoices() {
        Navigation navigation = new Navigation();
        String[] expectedMainChoices = { "nyjan", "vista", "skoda", "haetta" };
        Assert.assertArrayEquals(expectedMainChoices, navigation.getMainChoices());
    }

    @Test
    public void testGetFavChoices() {
        Navigation navigation = new Navigation();
        String[] expectedFavChoices = { "baka", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        Assert.assertArrayEquals(expectedFavChoices, navigation.getFavChoices());
    }

}