package interest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ParseCLIOptionsTest extends TestCase
{
	public static final String SOME_INVALID_TAG = "--invalid_tag";

	public static final double DOUBLE_VAL_TOLERANCE = 0.0001;

	public static final String 
	      TEST_CASE_FAIL_DESC_VALID_USER_OPTION_TAG = 
							"The user option tag should not be valid";

	public static final String 
	      TEST_CASE_PASS_DESC_VALID_USER_OPTION_TAG = 
							"The user option tag should be valid";

	public static final String 
	      TEST_CASE_FAIL_DESC_VALID_INTEREST_TYPE_TAG = 
							"The interest type tag should not be valid";

	public static final String 
	      TEST_CASE_PASS_DESC_VALID_INTEREST_TYPE_TAG = 
							"The interest type tag should be valid";

	public static final String 
	      TEST_CASE_FAIL_DESC_VALID_INTEREST_TYPE_VAL = 
							"The interest type value should not be valid";

	public static final String 
	      TEST_CASE_PASS_DESC_VALID_INTEREST_TYPE_VAL = 
							"The interest type value should be valid";

	public static final String 
	      TEST_CASE_FAIL_DESC_VALID_PRINCIPLE_TAG = 
							"The principle tag should not be valid";

	public static final String 
	      TEST_CASE_PASS_DESC_VALID_PRINCIPLE_TAG = 
							"The principle tag should be valid";

	public static final String 
	      TEST_CASE_FAIL_DESC_VALID_PRINCIPLE_VAL = 
							"The principle value should not be valid";

	public static final String 
	      TEST_CASE_PASS_DESC_VALID_PRINCIPLE_VAL = 
							"The principle value should be valid";

	public static final String 
	      TEST_CASE_FAIL_DESC_VALID_RATE_TAG = 
							"The rate tag should not be valid";

	public static final String 
	      TEST_CASE_PASS_DESC_VALID_RATE_TAG = 
							"The rate tag should be valid";

	public static final String 
	      TEST_CASE_FAIL_DESC_VALID_RATE_VAL = 
							"The rate value should not be valid";

	public static final String 
	      TEST_CASE_PASS_DESC_VALID_RATE_VAL = 
							"The rate value should be valid";

	public static final String 
	      TEST_CASE_FAIL_DESC_VALID_TIME_TAG = 
							"The time tag should not be valid";

	public static final String 
	      TEST_CASE_PASS_DESC_VALID_TIME_TAG = 
							"The time tag should be valid";

	public static final String 
	      TEST_CASE_FAIL_DESC_VALID_TIME_VAL = 
							"The time value should not be valid";

	public static final String 
	      TEST_CASE_PASS_DESC_VALID_TIME_VAL = 
							"The time value should be valid";

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ParseCLIOptionsTest ()
    {
        super("ParseCLIOptionsTest");
    }

    /**
     * Rigourous Test :-)
     */
    public void test_validate_user_option_tag ()
    {
        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_USER_OPTION_TAG, false,
        	ParseCLIOptions.validate_user_option_tag(null, null));

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_USER_OPTION_TAG, false,
        	ParseCLIOptions.validate_user_option_tag("string", null));

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_USER_OPTION_TAG, false,
        	ParseCLIOptions.validate_user_option_tag(null, "string"));

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_USER_OPTION_TAG, false,
        	ParseCLIOptions.validate_user_option_tag("strings", "string"));

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_USER_OPTION_TAG, false,
        	ParseCLIOptions.validate_user_option_tag("string", "strings"));

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_USER_OPTION_TAG, true,
        	ParseCLIOptions.validate_user_option_tag("string", "string"));  

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_USER_OPTION_TAG, true,
        	ParseCLIOptions.validate_user_option_tag("STRING", "STRING"));    

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_USER_OPTION_TAG, true,
        	ParseCLIOptions.validate_user_option_tag("string", "STRING")); 

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_USER_OPTION_TAG, true,
        	ParseCLIOptions.validate_user_option_tag("STRING", "string")); 
        
        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_USER_OPTION_TAG, true,
        	ParseCLIOptions.validate_user_option_tag("STRing", "strING"));
    }

    public void test_validate_user_interest_type_tag ()
    {
        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_INTEREST_TYPE_TAG, false,
        	ParseCLIOptions.validate_user_interest_type_tag(null));   

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_INTEREST_TYPE_TAG, false,
        	ParseCLIOptions.validate_user_interest_type_tag(SOME_INVALID_TAG));   

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_INTEREST_TYPE_TAG, true,
        	ParseCLIOptions.validate_user_interest_type_tag("--interest_type")); 

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_INTEREST_TYPE_TAG, true,
        	ParseCLIOptions.validate_user_interest_type_tag("--INTEREST_TYPE")); 

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_INTEREST_TYPE_TAG, true,
        	ParseCLIOptions.validate_user_interest_type_tag("--interest_TYPE")); 
    }

    public void test_validate_user_principle_tag ()
    {
        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_PRINCIPLE_TAG, false,
        	ParseCLIOptions.validate_user_principle_tag(null));   

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_PRINCIPLE_TAG, false,
        	ParseCLIOptions.validate_user_principle_tag(SOME_INVALID_TAG));   

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_PRINCIPLE_TAG, true,
        	ParseCLIOptions.validate_user_principle_tag("--principle")); 

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_PRINCIPLE_TAG, true,
        	ParseCLIOptions.validate_user_principle_tag("--PRINCIPLE")); 

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_PRINCIPLE_TAG, true,
        	ParseCLIOptions.validate_user_principle_tag("--PRINCIple")); 
    }

    public void test_validate_user_rate_tag ()
    {
        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_RATE_TAG, false,
        	ParseCLIOptions.validate_user_rate_tag(null));   

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_RATE_TAG, false,
        	ParseCLIOptions.validate_user_rate_tag(SOME_INVALID_TAG));   

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_RATE_TAG, true,
        	ParseCLIOptions.validate_user_rate_tag("--rate")); 

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_RATE_TAG, true,
        	ParseCLIOptions.validate_user_rate_tag("--RATE")); 

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_RATE_TAG, true,
        	ParseCLIOptions.validate_user_rate_tag("--raTE")); 
    }

    public void test_validate_user_time_tag ()
    {
        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_TIME_TAG, false,
        	ParseCLIOptions.validate_user_time_tag(null));   

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_TIME_TAG, false,
        	ParseCLIOptions.validate_user_time_tag(SOME_INVALID_TAG));   

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_TIME_TAG, true,
        	ParseCLIOptions.validate_user_time_tag("--time")); 

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_TIME_TAG, true,
        	ParseCLIOptions.validate_user_time_tag("--TIME")); 

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_TIME_TAG, true,
        	ParseCLIOptions.validate_user_time_tag("--tIMe")); 
    }

    public void test_parse_and_get_user_interest_type ()
    {
    	assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_INTEREST_TYPE_VAL, 
        	InterestType.INVALID,
        	ParseCLIOptions.parse_and_get_user_interest_type(null));  

    	assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_INTEREST_TYPE_VAL, 
        	InterestType.INVALID,
        	ParseCLIOptions.parse_and_get_user_interest_type("string")); 

    	assertEquals(
        	TEST_CASE_PASS_DESC_VALID_INTEREST_TYPE_VAL, 
        	InterestType.SIMPLE,
        	ParseCLIOptions.parse_and_get_user_interest_type(
        					ParseCLIOptions.INTEREST_TYPE_SIMPLE));  
    	assertEquals(
        	TEST_CASE_PASS_DESC_VALID_INTEREST_TYPE_VAL, 
        	InterestType.SIMPLE,
        	ParseCLIOptions.parse_and_get_user_interest_type(
        		ParseCLIOptions.INTEREST_TYPE_SIMPLE.toUpperCase())); 

    	assertEquals(
        	TEST_CASE_PASS_DESC_VALID_INTEREST_TYPE_VAL, 
        	InterestType.COMPOUND,
        	ParseCLIOptions.parse_and_get_user_interest_type(
        					ParseCLIOptions.INTEREST_TYPE_COMPOUND));  

    	assertEquals(
        	TEST_CASE_PASS_DESC_VALID_INTEREST_TYPE_VAL, 
        	InterestType.COMPOUND,
        	ParseCLIOptions.parse_and_get_user_interest_type(
        		ParseCLIOptions.INTEREST_TYPE_COMPOUND.toUpperCase()));  
    }

    public void test_parse_and_get_principle ()
    {
        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_PRINCIPLE_VAL, 
        	ParseCLIOptions.ILLEGAL_PRINCIPLE,
        	ParseCLIOptions.parse_and_get_principle(null),
        	DOUBLE_VAL_TOLERANCE); 

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_PRINCIPLE_VAL, 
        	ParseCLIOptions.ILLEGAL_PRINCIPLE,
        	ParseCLIOptions.parse_and_get_principle("string"),
        	DOUBLE_VAL_TOLERANCE);   

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_PRINCIPLE_VAL, 
        	ParseCLIOptions.ILLEGAL_PRINCIPLE,
        	ParseCLIOptions.parse_and_get_principle("s456.9ght"),
        	DOUBLE_VAL_TOLERANCE);   

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_PRINCIPLE_VAL, 
        	Double.parseDouble("1000.0001"),
        	ParseCLIOptions.parse_and_get_principle("1000.0001"),
        	DOUBLE_VAL_TOLERANCE);           

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_PRINCIPLE_VAL, 
        	Double.parseDouble("-1000.0001"),
        	ParseCLIOptions.parse_and_get_principle("-1000.0001"),
        	DOUBLE_VAL_TOLERANCE);     

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_PRINCIPLE_VAL, 
        	Double.parseDouble("0.0"),
        	ParseCLIOptions.parse_and_get_principle("0.0"),
        	DOUBLE_VAL_TOLERANCE);  
    }

    public void test_parse_and_get_rate ()
    {
        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_RATE_VAL, 
        	ParseCLIOptions.ILLEGAL_RATE,
        	ParseCLIOptions.parse_and_get_rate(null),
        	DOUBLE_VAL_TOLERANCE); 

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_RATE_VAL, 
        	ParseCLIOptions.ILLEGAL_RATE,
        	ParseCLIOptions.parse_and_get_rate("string"),
        	DOUBLE_VAL_TOLERANCE);   

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_RATE_VAL, 
        	ParseCLIOptions.ILLEGAL_RATE,
        	ParseCLIOptions.parse_and_get_rate("s456.9ght"),
        	DOUBLE_VAL_TOLERANCE);   

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_RATE_VAL, 
        	Double.parseDouble("1000.0001"),
        	ParseCLIOptions.parse_and_get_rate("1000.0001"),
        	DOUBLE_VAL_TOLERANCE);           

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_RATE_VAL, 
        	Double.parseDouble("-1000.0001"),
        	ParseCLIOptions.parse_and_get_rate("-1000.0001"),
        	DOUBLE_VAL_TOLERANCE);     

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_RATE_VAL, 
        	Double.parseDouble("0.0"),
        	ParseCLIOptions.parse_and_get_rate("0.0"),
        	DOUBLE_VAL_TOLERANCE);  
    }

    public void test_parse_and_get_time ()
    {
        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_TIME_VAL, 
        	ParseCLIOptions.ILLEGAL_TIME,
        	ParseCLIOptions.parse_and_get_time(null)); 

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_TIME_VAL, 
        	ParseCLIOptions.ILLEGAL_TIME,
        	ParseCLIOptions.parse_and_get_time("string"));

        assertEquals(
        	TEST_CASE_FAIL_DESC_VALID_TIME_VAL, 
        	ParseCLIOptions.ILLEGAL_TIME,
        	ParseCLIOptions.parse_and_get_time("s4569ght"));

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_TIME_VAL, 
        	Integer.parseInt("1000"),
        	ParseCLIOptions.parse_and_get_time("1000"));

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_TIME_VAL, 
        	Integer.parseInt("-1000"),
        	ParseCLIOptions.parse_and_get_time("-1000"));

        assertEquals(
        	TEST_CASE_PASS_DESC_VALID_TIME_VAL, 
        	Integer.parseInt("0"),
        	ParseCLIOptions.parse_and_get_time("0"));  
    }
}