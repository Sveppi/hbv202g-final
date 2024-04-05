package is.hi.hbv202g.finalass.commands;

import org.junit.Test;
import is.hi.hbv202g.finalass.Idioms;
import static org.mockito.Mockito.*;

public class NyjanCommandTest {
    @Test
    public void testExecute() {
        // Arrange
        Idioms idioms = mock(Idioms.class);
        NyjanCommand command = new NyjanCommand(idioms);

        // Act
        command.execute();

        // Assert
        verify(idioms).getCurrent();
    }
}
