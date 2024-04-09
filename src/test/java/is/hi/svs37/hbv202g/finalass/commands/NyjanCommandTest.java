package is.hi.svs37.hbv202g.finalass.commands;

import org.junit.Test;

import is.hi.svs37.hbv202g.finalass.Idioms;
import is.hi.svs37.hbv202g.finalass.commands.NyjanCommand;

import static org.mockito.Mockito.*;

/**
 * This class contains unit tests for the NyjanCommand class.
 */
public class NyjanCommandTest {
    
    /**
     * Test case for the execute method of the NyjanCommand class.
     * 
     * This test verifies that the execute method correctly interacts with the Idioms class.
     * It sets up a mock Idioms object, creates a NyjanCommand object with the mock Idioms,
     * calls the execute method, and then verifies that the getCurrent method of the Idioms
     * object was called.
     */
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
