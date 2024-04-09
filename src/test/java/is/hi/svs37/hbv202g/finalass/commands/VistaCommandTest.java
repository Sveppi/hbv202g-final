package is.hi.svs37.hbv202g.finalass.commands;

import org.junit.Test;
import is.hi.svs37.hbv202g.finalass.Favorites;
import is.hi.svs37.hbv202g.finalass.Idioms;
import static org.mockito.Mockito.*;

/**
 * This class contains unit tests for the VistaCommand class.
 */
public class VistaCommandTest {
     /**
     * Test case for the execute method of VistaCommand.
     */
    @Test
    public void testExecute() {
        // Arrange
        Idioms idioms = mock(Idioms.class);
        Favorites favs = mock(Favorites.class);
        int current = 0;
        VistaCommand command = new VistaCommand(idioms, favs, current);

        // Act
        command.execute();

        // Assert
        verify(favs).addFavorite(anyString());
    }
}