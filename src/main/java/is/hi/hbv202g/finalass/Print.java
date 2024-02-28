package is.hi.hbv202g.finalass;

public class Print {
    
    Print() {
        // private constructor to hide the implicit public one
    }
    
    public static void printInit(Idioms idioms) {
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
        System.out.print("til að fara til baka, skrifaðu 'baka': ");
    }

    public static void printIdiom(Idioms idioms) {
        System.out.println("\n" + idioms.getRandomIdiom() + "\n");
    }
}
