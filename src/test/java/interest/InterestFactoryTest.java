package interest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple InterestFactory.
 */
public class InterestFactoryTest 
    extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public InterestFactoryTest()
    {
        super("InterestFactory");
    }

    /**
     * Rigourous Test :-)
     */
    public void test_interest_factory_with_invalid_user_config ()
    {
        UserConfig user_config = new UserConfig(InterestType.INVALID);
        InterestFactory interest_factory_invalid = new InterestFactory();

        try {
            Interest invalid_interest = 
                    interest_factory_invalid.get_interest_object(user_config);
            assertTrue(false);
        } catch (UnsupportedInterestType unsupported_interest_type) {
            assertTrue(true);
        }
    }

    public void test_interest_factory_with_simple_user_config ()
    {
        UserConfig user_config = new UserConfig(InterestType.SIMPLE);
        InterestFactory interest_factory_invalid = new InterestFactory();

        try {
            Interest invalid_interest = 
                    interest_factory_invalid.get_interest_object(user_config);
            assertTrue(true);
        } catch (UnsupportedInterestType unsupported_interest_type) {
            assertTrue(false);
        }
    }

    public void test_interest_factory_with_compound_user_config ()
    {
        UserConfig user_config = new UserConfig(InterestType.COMPOUND);
        InterestFactory interest_factory_invalid = new InterestFactory();

        try {
            Interest invalid_interest = 
                    interest_factory_invalid.get_interest_object(user_config);
            assertTrue(true);
        } catch (UnsupportedInterestType unsupported_interest_type) {
            assertTrue(false);
        }
    }
}
