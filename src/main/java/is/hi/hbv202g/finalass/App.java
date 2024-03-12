package is.hi.hbv202g.finalass;

import java.util.Scanner;

public class App {
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
