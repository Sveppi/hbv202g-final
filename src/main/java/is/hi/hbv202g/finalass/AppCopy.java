package is.hi.hbv202g.finalass;

import java.util.Arrays;
import java.util.Scanner;


// main class prior to refactoring
public class AppCopy {
    public static void main(String[] args) {
        Favorites favs = new Favorites();
        Idioms idioms = new Idioms();
        Navigation nav = new Navigation();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        init(idioms);
        
        int currentIdiom = idioms.getCurrent();

        while (running) {
            printMainInstr();

            String choice = scanner.nextLine();

            if (!Arrays.asList(nav.getMainChoices()).contains(choice)) {
                System.out.println("\nÓgilt val\n");
                continue;
            }

            if (choice.equals("nyjan")) {
                System.out.println("\n ");
                System.out.println(idioms.getRandomIdiom());
                currentIdiom = idioms.getCurrent();
                System.out.println("\n ");
            }

            if (choice.equals("vista")) {
                boolean saved = favs.addFavorite(Idioms.getIdiomCollection()[currentIdiom]);
                if (saved) {
                    System.out.println("\n" + "Málsháttur vistaður, hérna er nýr:\n");
                    System.out.println(idioms.getRandomIdiom() + "\n");
                    currentIdiom = idioms.getCurrent();
                } else {
                    System.out.println(Idioms.getIdiomCollection()[currentIdiom] + "\n");
                }
            }

            if (choice.equals("skoda")) {
                boolean inFav = true;
                printFavInstr(favs);
                String favchoice = scanner.nextLine();

                while (inFav) {
                    if (!Arrays.asList(nav.getFavChoices()).contains(favchoice)) {
                        System.out.println("Ógilt val");
                        continue;
                    }

                    if (Arrays.asList(nav.getFavChoices()).contains(favchoice)) {
                        if (Integer.parseInt(favchoice) == 0)
                            inFav = false;
                        else {
                            favs.removeFavorite(Integer.parseInt(favchoice));
                            System.out.println("\n" + "Málsháttur fjarlægður úr úppáhalds\n");
                        }
                    }

                    printFavInstr(favs);
                    favchoice = scanner.nextLine();
                }

            }

            if (choice.equals("haetta"))
                running = false;
        }

        scanner.close();
    }

    public static void init(Idioms x) {
        System.out.println("Velkomi/n/nn/ið í Málshátt!\n");
        System.out.println("Hérna er handahófskenndur málháttur:\n");
        System.out.println(x.getRandomIdiom() + "\n");
    }

    public static void printMainInstr() {
        System.out.println("Valmöguleikar:");
        System.out.println("Nýjan málshátt - 'nyjan'");
        System.out.println("Bæta málshátt í uppáhalds - 'vista'");
        System.out.println("Skoða úppháldsmálshætti - 'skoda'");
        System.out.println("Hætta í Málshætti - 'haetta'");
        System.out.print("Sláðu inn val: ");
    }

    public static void printFavInstr(Favorites x) {
        System.out.println("\n" + x.toString());
        System.out.println("Til að eyða úr uppáhalds, skrifaðu númerið,");
        System.out.print("Til að fara til baka, skrifaðu '0':");
    }
}
