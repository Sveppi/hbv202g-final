package is.hi.hbv202g.finalass;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Favorites favs = new Favorites();
        Idioms idioms = new Idioms();
        Navigation nav = new Navigation();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        init(idioms);
        
        int currentIdiom = idioms.getCurrent();

        while (running) {
            String choice = getChoice(scanner, nav);
    
            if (choice.equals("nyjan")) {
                currentIdiom = handleNyjanChoice(idioms);
            }
    
            if (choice.equals("vista")) {
                currentIdiom = handleVistaChoice(favs, idioms, currentIdiom);
            }
    
            if (choice.equals("skoda")) {
                handleSkodaChoice(favs, scanner, nav, currentIdiom);
            }
    
            if (choice.equals("haetta")) {
                handleHaettaChoice();
                running = false;
            }
        }
    }

    static String getChoice(Scanner scanner, Navigation nav) {
        printMainInstr();
        String choice = scanner.nextLine();

        if (!Arrays.asList(nav.getMainChoices()).contains(choice)) {
            System.out.println("\nÓgilt val\n");
            return getChoice(scanner, nav);
        }

        return choice;
    }

    private static int handleNyjanChoice(Idioms idioms) {
        printIdiom(idioms);
        return idioms.getCurrent();
    }

    private static int handleVistaChoice(Favorites favs, Idioms idioms, int currentIdiom) {
        boolean saved = favs.addFavorite(Idioms.getIdiomCollection()[currentIdiom]);
        if (saved) {
            System.out.println("\n" + "Málsháttur vistaður, hérna er nýr:");
            printIdiom(idioms);
            currentIdiom = idioms.getCurrent();
        } else {
            System.out.println(Idioms.getIdiomCollection()[currentIdiom] + "\n");
        }
        return currentIdiom;
    }
    
    private static void handleSkodaChoice(Favorites favs, Scanner scanner, Navigation nav, int current) {
        boolean inFav = true;

        while (inFav) {
            printFavInstr(favs);
            String favchoice = scanner.nextLine();

            if (!Arrays.asList(nav.getFavChoices()).contains(favchoice)) {
                System.out.println("Ógilt val");
                continue;
            }

            if (favchoice.equals("baka")) {
                System.out.println("\n" + "Hérna er síðasti málsháttur:");
                System.out.print(Idioms.getIdiomCollection()[current] + "\n");
                inFav = false;
            } else {
                favs.removeFavorite(Integer.parseInt(favchoice));
                System.out.println("\n" + "Málsháttur fjarlægður úr úppáhalds\n");
            }
        }
    }
    
    private static void handleHaettaChoice() {
        System.out.println("\nTakk fyrir að nota Málshátt! Vertu sæ/l/ll/lt!\n");
        System.exit(0);
    }


    public static void init(Idioms idioms) {
        System.out.println("Velkomi/n/nn/ið í Málshátt!\n");
        System.out.println("Hérna er handahófskenndur málháttur:");
        printIdiom(idioms);
    }

    public static void printMainInstr() {
        System.out.println("___________________");
        System.out.println("Valmöguleikar:");
        System.out.println("Nýjan málshátt - 'nyjan'");
        System.out.println("Bæta málshátt í uppáhalds - 'vista'");
        System.out.println("Skoða úppháldsmálshætti - 'skoda'");
        System.out.println("Hætta í Málshætti - 'haetta'");
        System.out.println("___________________");
        System.out.print("Sláðu inn val: ");
    }

    public static void printFavInstr(Favorites favs) {
        System.out.println("\n" + favs.toString());
        System.out.println("___________________");
        System.out.println("Til að eyða úr uppáhalds, skrifaðu númerið,");
        System.out.print("til að fara til baka, skrifaðu 'baka':");
    }

    public static void printIdiom(Idioms idioms) {
        System.out.println("\n" + idioms.getRandomIdiom() + "\n");
    }



}
