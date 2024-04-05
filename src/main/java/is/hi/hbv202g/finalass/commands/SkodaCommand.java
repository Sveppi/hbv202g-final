package is.hi.hbv202g.finalass.commands;

import java.util.Arrays;
import java.util.Scanner;

import is.hi.hbv202g.finalass.Favorites;
import is.hi.hbv202g.finalass.Navigation;
import is.hi.hbv202g.finalass.Print;

/**
 * The SkodaCommand class represents a command to remove a favorite item from the favorites list.
 * It implements the Command interface.
 */
public class SkodaCommand implements Command {
    private Scanner scanner;
    private Favorites favs;
    private int current;

    /**
     * Constructs a new SkodaCommand with the specified scanner, favorites, and current index.
     *
     * @param scanner the scanner used for user input
     * @param favs the favorites list
     * @param current the current index
     */
    public SkodaCommand(Scanner scanner, Favorites favs, int current) {
        this.scanner = scanner;
        this.favs = favs;
        this.current = current;
    }

    /**
     * Executes the SkodaCommand by removing a favorite item from the favorites list.
     * It prompts the user to choose a favorite item to remove and handles the user's input accordingly.
     */
    @Override
    public void execute() {
        boolean inFav = true;

        while (inFav) {
            Print.printFavInstr(favs);
            String favchoice = scanner.nextLine();

            if (!Arrays.asList(Navigation.getFavChoices()).contains(favchoice)) {
                Print.printInvalidChoice();
                continue;
            }

            if (favchoice.equals("baka")) {
                Print.printReturnfromFav(current);
                inFav = false;
            } else {
                favs.removeFavorite(Integer.parseInt(favchoice));
                Print.printRemovefromFav();
            }
        }
    }
}
