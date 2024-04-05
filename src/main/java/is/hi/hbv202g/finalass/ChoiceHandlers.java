package is.hi.hbv202g.finalass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import is.hi.hbv202g.finalass.commands.Command;
import is.hi.hbv202g.finalass.commands.HaettaCommand;
import is.hi.hbv202g.finalass.commands.NyjanCommand;
import is.hi.hbv202g.finalass.commands.SkodaCommand;
import is.hi.hbv202g.finalass.commands.VistaCommand;

/**
 * The ChoiceHandlers class handles the user's choices and executes the corresponding commands.
 * It contains a map of commands and prompts the user for their choice.
 * If a valid command is found, it is executed. Otherwise, an error message is printed
 * and the user is prompted to enter a valid choice again.
 */
public class ChoiceHandlers {
    private Scanner scanner;
    private Map<String, Command> commands = new HashMap<>();

    public ChoiceHandlers(Idioms idioms, Favorites favs, int current, Scanner scanner) {
        this.scanner = scanner;

        commands.put("nyjan", new NyjanCommand(idioms));
        commands.put("vista", new VistaCommand(idioms, favs, current));
        commands.put("skoda", new SkodaCommand(scanner, favs, current));
        commands.put("haetta", new HaettaCommand());

    }

    /**
     * Handles the user's choice by executing the corresponding command.
     * Retrieves the user's choice and looks up the corresponding command in the commands map.
     * If a valid command is found, it is executed. Otherwise, an error message is printed
     * and the user is prompted to enter a valid choice again.
     */
    public void handleChoice() {
        String choice = getChoice();
        Command command = commands.get(choice);
        if (command != null) {
            command.execute();
        } else {
            Print.printInvalidChoice();
            handleChoice();
        }
    }

    /**
     * Prompts the user with the main instruction and returns the user's choice as a string.
     *
     * @return the user's choice as a string
     */
    private String getChoice() {
        Print.printMainInstr();
        return scanner.nextLine();
    }

}
