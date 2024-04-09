package is.hi.svs37.hbv202g.finalass.commands;

import org.junit.Test;

import is.hi.svs37.hbv202g.finalass.Favorites;
import is.hi.svs37.hbv202g.finalass.commands.SkodaCommand;

import static org.mockito.Mockito.*;
import java.util.Scanner;

/**
 * This class contains unit tests for the SkodaCommand class.
 */
public class SkodaCommandTest {
    /**
     * Test case for the execute method of SkodaCommand.
     */
    @Test
    public void testExecute() {
        // Arrange
        Scanner scanner = new Scanner("1\nbaka"); // assuming "1" is a valid input
        Favorites favs = mock(Favorites.class);
        when(favs.getFavorite(1)).thenReturn("Málsháttur");
        int current = 0;
        SkodaCommand command = new SkodaCommand(scanner, favs, current);

        // Act
        command.execute();

        // Assert
        verify(favs).removeFavorite(eq(1));
    }
}