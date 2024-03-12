package is.hi.hbv202g.finalass;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The ChoiceHandlers class provides static methods for handling user choices in the application.
 * It includes methods for getting the user's choice, handling different choices, and performing
 * various actions based on the user's input. Uses Facade design pattern.
 */
public class ChoiceHandlers {

    private Idioms idioms;
    private Favorites favs;
    private int current;
    private Scanner scanner;

    public ChoiceHandlers(Idioms idioms, Favorites favs, int current, Scanner scanner) {
        this.idioms = idioms;
        this.favs = favs;
        this.current = current;
        this.scanner = scanner;
    }

    public void handleChoice() {
        String choice = getChoice();
        switch (choice) {
            case "nyjan":
                handleNyjanChoice();
                break;
            case "vista":
                handleVistaChoice();
                break;
            case "skoda":
                handleSkodaChoice();
                break;
            case "haetta":
                handleHaettaChoice();
                break;
            default:
                Print.printInvalidChoice();
                handleChoice();
                break;
        }
    }

    private String getChoice() {
        Print.printMainInstr();
        return scanner.nextLine();
    }

    private int handleNyjanChoice() {
        Print.printIdiom(idioms);
        return idioms.getCurrent();
    }

    private int handleVistaChoice() {
        boolean saved = favs.addFavorite(Idioms.getIdiomCollection()[current]);
        if (saved) {
            Print.printNewAfterSave(idioms);
            current = idioms.getCurrent();
        } else {
            System.out.println(Idioms.getIdiomCollection()[current] + "\n");
        }
        return current;
    }

    private void handleSkodaChoice() {
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

    private void handleHaettaChoice() {
        Print.printQuit();
        System.exit(0);
    }

}
