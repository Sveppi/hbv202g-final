package is.hi.hbv202g.finalass;

/**
 *  The `NyjanCommand` class represents a command that prints the current idiom 
 *  and retrieves the next idiom from the Idioms object.
 *  It implements the `Command` interface.
 */
public class NyjanCommand implements Command {
    private Idioms idioms;

    /**
     * Constructs a new NyjanCommand with the specified Idioms object.
     * 
     * @param idioms the Idioms object to use
     */
    public NyjanCommand(Idioms idioms) {
        this.idioms = idioms;
    }

    /**
     * Executes the NyjanCommand.
     * This method prints the current idiom and retrieves the next idiom from the Idioms object.
     */
    @Override
    public void execute() {
        Print.printIdiom(idioms);
        idioms.getCurrent();
    }
}