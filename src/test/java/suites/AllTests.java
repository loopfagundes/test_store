package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import testcases.LojaTestCase;


@RunWith(Suite.class)
@SuiteClasses({
        LojaTestCase.class,
        LojaTestCase.class
})
public class AllTests {
}

