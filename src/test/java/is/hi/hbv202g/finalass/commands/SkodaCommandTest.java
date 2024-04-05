package is.hi.hbv202g.finalass.commands;

import org.junit.Test;

import is.hi.hbv202g.finalass.Favorites;
import is.hi.hbv202g.finalass.Idioms;
import static org.mockito.Mockito.*;


import java.util.Scanner;



public class SkodaCommandTest {
    @Test
    public void testExecute() {
        // Arrange
        Scanner scanner = new Scanner("1"); // assuming "1" is a valid input
        Favorites favs = mock(Favorites.class);
        int current = 0;
        SkodaCommand command = new SkodaCommand(scanner, favs, current);

        // Act
        command.execute();

        // Assert
        verify(favs).removeFavorite(anyInt());


    }
}