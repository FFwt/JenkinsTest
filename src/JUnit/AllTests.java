package JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TaskTest1.class, TaskTest2.class, TaskTest3.class })
public class AllTests {

}
