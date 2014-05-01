package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ HourConverterTest.class, MinutesConverterTest.class,
		TimeConverterTest.class })
public class AllTests {

}
