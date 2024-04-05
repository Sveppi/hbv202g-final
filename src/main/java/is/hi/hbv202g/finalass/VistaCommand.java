package is.hi.hbv202g.finalass;

/**
 * The `VistaCommand` class represents a command that adds an idiom to the favorites list.
 * It implements the `Command` interface.
 */
public class VistaCommand implements Command {
    private Idioms idioms;
    private Favorites favs;
    private int current;

    /**
     * Constructs a new `VistaCommand` object with the specified `idioms`, `favs`, and `current` values.
     *
     * @param idioms  the `Idioms` object representing the collection of idioms
     * @param favs    the `Favorites` object representing the favorites list
     * @param current the index of the current idiom in the collection
     */
    public VistaCommand(Idioms idioms, Favorites favs, int current) {
        this.idioms = idioms;
        this.favs = favs;
        this.current = current;
    }

    /**
     * Executes the `VistaCommand` by adding the current idiom to the favorites list.
     * If the idiom is successfully added, it prints the updated favorites list.
     * If the idiom is already in the favorites list, it prints the idiom without adding it again.
     */
    @Override
    public void execute() {
        boolean saved = favs.addFavorite(Idioms.getIdiomCollection()[current]);
        if (saved) {
            Print.printNewAfterSave(idioms);
            current = idioms.getCurrent();
        } else {
            System.out.println(Idioms.getIdiomCollection()[current] + "\n");
        }
    }
}