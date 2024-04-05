package is.hi.hbv202g.finalass.commands;

import is.hi.hbv202g.finalass.Print;

/**
 * The HaettaCommand class represents a command to quit the program.
 * It implements the Command interface.
 */
public class HaettaCommand implements Command {
    /**
     * Executes the command to quit the program.
     * It calls the Print.printQuit() method to display a quit message,
     * and then exits the program with a status code of 0.
     */
    @Override
    public void execute() {
        Print.printQuit();
        System.exit(0);
    }
}