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

    /**
     * Handles the user's choice by calling the appropriate method based on the choice.
     * The choice is obtained from the user using the getChoice() method.
     * If the choice is "nyjan", the handleNyjanChoice() method is called.
     * If the choice is "vista", the handleVistaChoice() method is called.
     * If the choice is "skoda", the handleSkodaChoice() method is called.
     * If the choice is "haetta", the handleHaettaChoice() method is called.
     * If the choice is invalid, the printInvalidChoice() method is called and the user is prompted to enter a valid choice.
     * This process continues until a valid choice is entered.
     */
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

    /**
     * Prompts the user with the main instruction and returns the user's choice as a string.
     *
     * @return the user's choice as a string
     */
    private String getChoice() {
        Print.printMainInstr();
        return scanner.nextLine();
    }

    /**
     * Handles the "Nyjan" choice by printing the available idioms and returning the current idiom.
     *
     * @return The current idiom.
     */
    private int handleNyjanChoice() {
        Print.printIdiom(idioms);
        return idioms.getCurrent();
    }

    /**
     * Handles the "Vista" choice.
     * Adds the current idiom to the favorites list and updates the current idiom.
     * If the idiom is successfully added to the favorites list, it prints a message indicating the addition.
     * If the idiom is already in the favorites list, it prints the idiom without adding it again.
     * 
     * @return The index of the current idiom.
     */
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

    /**
     * Handles the Skoda choice by allowing the user to interact with their favorite choices.
     * The user is prompted to select a favorite choice and can choose to remove it from their favorites or return to the previous menu.
     * If an invalid choice is entered, the user is prompted to enter a valid choice.
     */
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

    /**
     * Handles the "Haetta" choice.
     * 
     * This method prints a quit message and exits the program.
     */
    private void handleHaettaChoice() {
        Print.printQuit();
        System.exit(0);
    }

}
