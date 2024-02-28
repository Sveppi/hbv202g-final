package is.hi.hbv202g.finalass;

import java.util.Arrays;
import java.util.Scanner;

public class ChoiceHandlers {

    private static String choice(Scanner scanner) {
        Print.printMainInstr();
        String choice = scanner.nextLine();

        if (!Arrays.asList(Navigation.getMainChoices()).contains(choice)) {
            System.out.println("\nÓgilt val\n");
            return getChoice(scanner);
        }

        return choice;
    }

    public static String getChoice(Scanner scanner) {
        return choice(scanner);
    }

    private static int nyjanChoice(Idioms idioms) {
        Print.printIdiom(idioms);
        return idioms.getCurrent();
    }

    public static int handleNyjanChoice(Idioms idioms) {
        return nyjanChoice(idioms);
    }

    private static int vistaChoice(Favorites favs, Idioms idioms, int currentIdiom) {
        boolean saved = favs.addFavorite(Idioms.getIdiomCollection()[currentIdiom]);
        if (saved) {
            System.out.println("\n" + "Málsháttur vistaður, hérna er nýr:");
            Print.printIdiom(idioms);
            currentIdiom = idioms.getCurrent();
        } else {
            System.out.println(Idioms.getIdiomCollection()[currentIdiom] + "\n");
        }
        return currentIdiom;
    }

    public static int handleVistaChoice(Favorites favs, Idioms idioms, int currentIdiom) {
        return vistaChoice(favs, idioms, currentIdiom);
    }

    private static void skodaChoice(Favorites favs, Scanner scanner, int current) {
        boolean inFav = true;

        while (inFav) {
            Print.printFavInstr(favs);
            String favchoice = scanner.nextLine();

            if (!Arrays.asList(Navigation.getFavChoices()).contains(favchoice)) {
                System.out.println("Ógilt val");
                continue;
            }

            if (favchoice.equals("baka")) {
                System.out.println("\n" + "Hérna er síðasti málsháttur:" + "\n");
                System.out.print(Idioms.getIdiomCollection()[current] + "\n");
                inFav = false;
            } else {
                favs.removeFavorite(Integer.parseInt(favchoice));
                System.out.println("\n" + "Málsháttur fjarlægður úr úppáhalds\n");
            }
        }
    }

    public static void handleSkodaChoice(Favorites favs, Scanner scanner, int current) {
        skodaChoice(favs, scanner, current);
    }

    private static void haettaChoice() {
        System.out.println("\nTakk fyrir að nota Málshátt! Vertu sæ/l/ll/lt!\n");
        System.exit(0);
    }

    public static void handleHaettaChoice() {
        haettaChoice();
    }

}
