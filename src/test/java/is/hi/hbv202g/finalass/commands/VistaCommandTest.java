package is.hi.hbv202g.finalass.commands;

import org.junit.Test;
import is.hi.hbv202g.finalass.Favorites;
import is.hi.hbv202g.finalass.Idioms;
import static org.mockito.Mockito.*;

public class VistaCommandTest {
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