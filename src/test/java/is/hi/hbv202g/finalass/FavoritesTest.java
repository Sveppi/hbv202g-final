package is.hi.hbv202g.finalass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FavoritesTest {

    private Favorites favorites;

    @Before
    public void setUp() {
        favorites = new Favorites();
    }

    @Test
    public void testGetFavs() {
        String[] expected = new String[10];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = "";
        }
        assertArrayEquals(expected, favorites.getFavs());
    }

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

    @Test
    public void testIsFavFull() {
        assertFalse(favorites.isFavFull());

        for (int i = 0; i < 10; i++) {
            favorites.addFavorite("Favorite " + (i + 1));
        }

        assertTrue(favorites.isFavFull());
    }

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