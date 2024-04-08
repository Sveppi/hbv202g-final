package is.hi.hbv202g.finalass;

/**
 * The Favorites class represents a list of favorite items.
 * It provides methods to add, remove, and retrieve favorite items.
 */
public class Favorites {
    private String[] favs;

    /**
     * The constructor initializes a string list for favorites,
     * and sets each entry as the empty string.
     */
    public Favorites() {
        favs = new String[10];
        for (int i = 0; i < favs.length; i++) favs[i] = "";
    }

    /**
     * Returns an array of favorite items.
     *
     * @return an array of favorite items
     */
    public String[] getFavs() {
        return favs;
    }

    /**
     * Returns a string representation of the Favorites object.
     * The string contains the index number and the value of each favorite item, separated by a newline character.
     * 
     * @return a string representation of the Favorites object
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < favs.length; i++) sb.append((i + 1) + ". " + favs[i] + "\n");
        return sb.toString();
    }

    /**
     * Retrieves the favorite item at the specified index.
     * 
     * @param x the index of the favorite item to retrieve
     * @return the favorite item at the specified index, or "Engin málsháttur í hólfi" if the index is out of range
     */
    public String getFavorite(int x) {
        if (x > 0 && x < 11) return favs[x-1];
        else return "Engin málsháttur í hólfi";
    }

    /**
     * Adds a favorite item to the favorites list.
     * 
     * @param x the item to be added to the favorites list
     * @return true if the item was successfully added, false if the favorites list is full
     */
    public boolean addFavorite(String x) {
        if (!isFavFull()) {
            favs[findFirstFree()] = x;
            return true;
        } else {
            Print.printFavsFull();
            return false;
        }
    }

    /**
     * Removes a favorite item from the favorites list.
     * 
     * @param x the index of the favorite item to be removed
     */
    public void removeFavorite(int x) {
        if (x > 0 && x < 11) favs[x - 1] = "";
    }

    /**
     * Finds the index of the first free element in the 'favs' array.
     * An element is considered free if it is null or an empty string.
     *
     * @return The index of the first free element, or -1 if all elements are non-null and non-empty.
     */
    public int findFirstFree() {
        for (int i = 0; i < favs.length; i++) {
            if (favs[i] == null || favs[i].equals("")) return i;
        }
        return -1; // return -1 if all elements are non-null and non-empty
    }

    /**
     * Checks if the favorites list is full.
     * 
     * @return true if the favorites list is full, false otherwise.
     */
    public boolean isFavFull() {
        return findFirstFree() == -1;
    }
}