package is.hi.svs37.hbv202g.finalass;

/**
 * The Print class provides methods for printing messages related to the Idioms application.
 */
public class Print {
    
    /**
     * Prints the initial welcome message and a randomly selected idiom.
     * 
     * @param idioms The Idioms object containing the list of idioms.
     */
    public static void printInit(Idioms idioms) {
        System.out.println("Velkomi/n/nn/ið í Málshátt!\n");
        System.out.println("Hérna er handahófskenndur málháttur:");
        printIdiom(idioms);
    }

    /**
     * Prints a randomly selected idiom.
     * 
     * @param idioms The Idioms object containing the list of idioms.
     */
    public static void printIdiom(Idioms idioms) {
        System.out.println("\n" + idioms.getRandomIdiom() + "\n");
    }

    /**
     * Prints the main menu instructions.
     */
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

    /**
     * Prints the instructions for managing favorite idioms.
     * 
     * @param favs The Favorites object containing the list of favorite idioms.
     */
    public static void printFavInstr(Favorites favs) {
        System.out.println("\n" + favs.toString());
        System.out.println("___________________");
        System.out.println("Til að eyða úr uppáhalds, skrifaðu númerið,");
        System.out.print("til að fara til baka, skrifaðu 'baka': ");
    }

    /**
     * Prints confirmation of saving the idiom and then prints a new randomly
     * selected idiom.
     * 
     * @param idioms The Idioms object containing the list of idioms.
     */
    public static void printNewAfterSave(Idioms idioms) {
        System.out.println("\n" + "Málsháttur vistaður, hérna er nýr:");
        printIdiom(idioms);
    }

    /**
     * Prints a thank you message when quitting the program.
     */
    public static void printQuit() {
        System.out.println("\nTakk fyrir að nota Málshátt! Vertu sæ/l/ll/lt!\n");
    }

    /**
     * Prints confirmation that an idiom has been removed from favorites.
     */
    public static void printRemovefromFav() {
        System.out.println("\n" + "Málsháttur fjarlægður úr úppáhalds\n");
    }

    /**
     * Prints the last idiom when returning from the favorites list.
     * 
     * @param current An int pointing to the current idiom from before viewing
     * the favoirites list
     */
    public static void printReturnfromFav(int current) {
        System.out.println("\n" + "Hérna er síðasti málsháttur:" + "\n");
        System.out.print(Idioms.getIdiomCollection()[current] + "\n");
    }

    /**
     * Prints a message informing user that they've made an invalid choice.
     */
    public static void printInvalidChoice() {
        System.out.println("\nÓgilt val\n");
    }

    /**
     * Prints a message informing the user that their chosen entry in the favorites
     * list is empty.
     */
    public static void printEmptyFavorite() {
        System.out.println("\n" + "Engin málsháttur í þessu hólfi\n");
    }

     /**
     * Prints a message informing the user that the favorites is full list is empty.
     */
    public static void printFavsFull() {
        System.out.println("\n" + "Uppáhalds er fullt, þarft að eyða til að geta vistað");
        System.out.println("Þetta var málshátturinn þinn:\n");
    }
}
