package is.hi.hbv202g.finalass;

/**
 * The Navigation class represents the navigation options available in the
 * application.
 * It provides methods to retrieve the main choices and favorite choices.
 */
public class Navigation {
    private static final String[] mainChoices = new String[] { "nyjan", "vista", "skoda", "haetta" };
    private static final String[] favChoices = new String[] { "baka", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10" };

    /**
     * Returns the main choices available in the navigation.
     * 
     * @return an array of strings representing the main choices
     */
    public static String[] getMainChoices() {
        return mainChoices;
    }

    /**
     * Returns the favorite choices available in the navigation.
     * 
     * @return an array of strings representing the favorite choices
     */
    public static String[] getFavChoices() {
        return favChoices;
    }

}
