package is.hi.svs37.hbv202g.finalass;

import java.util.Scanner;

/**
 * The main class of the application.
 * This class initializes the necessary objects and starts the application loop.
 */
public class App {
    /**
     * The main method is the entry point of the application.
     * It initializes the necessary objects, sets up the user interface,
     * and handles user choices in a loop until the program is terminated.
     *
     * @param args The command line arguments passed to the program.
     */
    public static void main(String[] args) {
        Favorites favs = new Favorites();
        Idioms idioms = new Idioms();
        Scanner scanner = new Scanner(System.in);

        Print.printInit(idioms);
        int currentIdiom = idioms.getCurrent();

        ChoiceHandlers choiceHandlers = new ChoiceHandlers(idioms, favs, currentIdiom, scanner);

        while (true) {
            choiceHandlers.handleChoice();
        }
    }
    
}
