package is.hi.svs37.hbv202g.finalass;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import is.hi.svs37.hbv202g.finalass.commands.NyjanCommandTest;
import is.hi.svs37.hbv202g.finalass.commands.SkodaCommandTest;
import is.hi.svs37.hbv202g.finalass.commands.VistaCommandTest;

/**
 * This class represents a test suite that runs all the test classes for the composite pattern implementation.
 */
@RunWith(Suite.class)
@SuiteClasses({ 
    FavoritesTest.class, IdiomsTest.class, NavigationTest.class, NyjanCommandTest.class, 
    SkodaCommandTest.class, VistaCommandTest.class
})
public class Alltests {
}
