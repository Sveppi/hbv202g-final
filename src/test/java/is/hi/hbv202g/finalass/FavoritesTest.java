package is.hi.hbv202g.finalass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This class contains unit tests for the Favorites class.
 */
public class FavoritesTest {

    private Favorites favorites;

    /**
     * Sets up the test fixture by creating a new instance of Favorites.
     */
    @Before
    public void setUp() {
        favorites = new Favorites();
    }

    /**
     * Tests the getFavs method of the Favorites class.
     * It checks if the returned array is empty when no favorites have been added.
     */
    @Test
    public void testGetFavs() {
        String[] expected = new String[10];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = "";
        }
        assertArrayEquals(expected, favorites.getFavs());
    }

    /**
     * Tests the addFavorite method of the Favorites class.
     * It checks if favorites can be added successfully and if the limit of 10 favorites is enforced.
     */
    @Test
    public void testAddFavorite() {
        assertTrue(favorites.addFavorite("Favorite 1"));
        assertTrue(favorites.addFavorite("Favorite 2"));
        assertTrue(favorites.addFavorite("Favorite 3"));
        assertTrue(favorites.addFavorite("Favorite 4"));
        assertTrue(favorites.addFavorite("Favorite 5"));
        assertTrue(favorites.addFavorite("Favorite 6"));
        assertTrue(favorites.addFavorite("Favorite 7"));
        assertTrue(favorites.addFavorite("Favorite 8"));
        assertTrue(favorites.addFavorite("Favorite 9"));
        assertTrue(favorites.addFavorite("Favorite 10"));
        assertFalse(favorites.addFavorite("Favorite 11"));
    }

    /**
     * Tests the removeFavorite method of the Favorites class.
     * It checks if favorites can be removed successfully and if the array is updated correctly.
     */
    @Test
    public void testRemoveFavorite() {
        favorites.addFavorite("Favorite 1");
        favorites.addFavorite("Favorite 2");
        favorites.addFavorite("Favorite 3");

        favorites.removeFavorite(2);
        String[] expected = new String[] { "Favorite 1", "", "Favorite 3", "", "", "", "", "", "", "" };
        assertArrayEquals(expected, favorites.getFavs());

        favorites.removeFavorite(1);
        expected = new String[] { "", "", "Favorite 3", "", "", "", "", "", "", "" };
        assertArrayEquals(expected, favorites.getFavs());

        favorites.removeFavorite(4); // No change since index is out of bounds
        assertArrayEquals(expected, favorites.getFavs());
    }

    /**
     * Tests the isFavFull method of the Favorites class.
     * It checks if the method correctly identifies whether the favorites array is full or not.
     */
    @Test
    public void testIsFavFull() {
        assertFalse(favorites.isFavFull());

        for (int i = 0; i < 10; i++) {
            favorites.addFavorite("Favorite " + (i + 1));
        }

        assertTrue(favorites.isFavFull());
    }

    /**
     * Tests the findFirstFree method of the Favorites class.
     * It checks if the method correctly returns the index of the first free slot in the favorites array.
     */
    @Test
    public void testFindFirstFree() {
        assertEquals(0, favorites.findFirstFree());

        favorites.addFavorite("Favorite 1");
        favorites.addFavorite("Favorite 2");

        assertEquals(2, favorites.findFirstFree());

        favorites.removeFavorite(1);

        assertEquals(0, favorites.findFirstFree());

        favorites.addFavorite("Favorite 1");
        favorites.addFavorite("Favorite 3");
        favorites.addFavorite("Favorite 4");
        favorites.addFavorite("Favorite 5");
        favorites.addFavorite("Favorite 6");
        favorites.addFavorite("Favorite 7");
        favorites.addFavorite("Favorite 8");
        favorites.addFavorite("Favorite 9");
        favorites.addFavorite("Favorite 10");

        assertEquals(-1, favorites.findFirstFree());
    }
}