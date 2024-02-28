package is.hi.hbv202g.finalass;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Favorites favs = new Favorites();
        Idioms idioms = new Idioms();
        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;

        Print.printInit(idioms);
        int currentIdiom = idioms.getCurrent();

        while (running) {
            String choice = ChoiceHandlers.getChoice(scanner);

            if (choice.equals("nyjan")) {
                currentIdiom = ChoiceHandlers.handleNyjanChoice(idioms);
            }

            if (choice.equals("vista")) {
                currentIdiom = ChoiceHandlers.handleVistaChoice(favs, idioms, currentIdiom);
            }

            if (choice.equals("skoda")) {
                ChoiceHandlers.handleSkodaChoice(favs, scanner, currentIdiom);
            }

            if (choice.equals("haetta")) {
                ChoiceHandlers.handleHaettaChoice();
                running = false;
            }
        }
    }

}
