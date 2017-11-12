package interest;

public class ParseCLIOptions
{
    public static final String USAGE_STR =
                        "Usage: InterestCompute " +
                        "--interest_type {simple|compound}" +
                        " --principle <principle_val>" +
                        " --rate <rate_val>" +
                        " --time <time_val>";

    public static final String NO_CLI_OPTIONS_ERROR_STR =
                        "No CLI options provided";

    public static final String INTEREST_TYPE_TAG = "--interest_type";
    public static final String INTEREST_TYPE_SIMPLE = "simple";
    public static final String INTEREST_TYPE_COMPOUND = "compound";
    public static final String INTEREST_TYPE_OPTION_STR =
                                                "{simple|compound}";
    public static final String INTEREST_TYPE_TAG_ERROR_STR =
                            "Error parsing tag for interest type";
    public static final String INTEREST_TYPE_VAL_ERROR_STR =
                            "Error parsing value for interest type";

    public static final String PRINCIPLE_TAG = "--principle";
    public static final double ILLEGAL_PRINCIPLE = -1.0;
    public static final String PRINCIPLE_TAG_ERROR_STR =
                            "Error parsing tag for principle";
    public static final String PRINCIPLE_VAL_ERROR_STR =
                            "Error parsing value for principle";

    public static final String RATE_TAG = "--rate";
    public static final double ILLEGAL_RATE = -1.0;
    public static final String RATE_TAG_ERROR_STR =
                            "Error parsing tag for rate";
    public static final String RATE_VAL_ERROR_STR =
                            "Error parsing value for rate";

    public static final String TIME_TAG = "--time";
    public static final int ILLEGAL_TIME = -1;
    public static final String TIME_TAG_ERROR_STR =
                            "Error parsing tag for time";
    public static final String TIME_VAL_ERROR_STR =
                            "Error parsing value for time";

    public static boolean validate_user_option_tag (String user_option_tag,
                                                    String actual_option_tag)
    {
        if (user_option_tag == null || actual_option_tag == null) {
            return(false);
        }

        if (user_option_tag.toLowerCase().equals(
                                    actual_option_tag.toLowerCase())) {
            return(true);
        }

        return(false);
    }

    public static boolean validate_user_interest_type_tag (
                                                String interest_tag)
    {
        return(validate_user_option_tag(interest_tag, INTEREST_TYPE_TAG));
    }

    public static boolean validate_user_principle_tag (
                                                String principle_tag)
    {
        return(validate_user_option_tag(principle_tag, PRINCIPLE_TAG));
    }

    public static boolean validate_user_rate_tag (
                                                String rate_tag)
    {
        return(validate_user_option_tag(rate_tag, RATE_TAG));
    }

    public static boolean validate_user_time_tag (
                                                String time_tag)
    {
        return(validate_user_option_tag(time_tag, TIME_TAG));
    }
    public static InterestType parse_and_get_user_interest_type
                                                        (String interest_type)
    {
        if (interest_type == null) {
            return(InterestType.INVALID);
        }

        if (interest_type.toLowerCase().equals(INTEREST_TYPE_SIMPLE)) {
            return(InterestType.SIMPLE);
        }

        if (interest_type.toLowerCase().equals(INTEREST_TYPE_COMPOUND)) {
            return(InterestType.COMPOUND);
        }

        return(InterestType.INVALID);
    }

    public static double parse_and_get_principle (String principle)
    {
        if (principle == null) {
            return(ILLEGAL_PRINCIPLE);
        }

        try {
            double principle_val = Double.parseDouble(principle);

            return(principle_val);

        } catch (NumberFormatException num_fmt_except) {

        }

        return(ILLEGAL_PRINCIPLE);
    }

    public static double parse_and_get_rate (String rate)
    {
        if (rate == null) {
            return(ILLEGAL_RATE);
        }

        try {
            double rate_val = Double.parseDouble(rate);

            return(rate_val);

        } catch (NumberFormatException num_fmt_except) {

        }

        return(ILLEGAL_RATE);
    }

    public static int parse_and_get_time (String time)
    {
        if (time == null) {
            return(ILLEGAL_TIME);
        }

        try {
            int time_val = Integer.parseInt(time);

            return(time_val);

        } catch (NumberFormatException num_fmt_except) {

        }

        return(ILLEGAL_TIME);
    }

    public static UserConfig parse_cli_options (
                                    String[] args, int num_cli_options)
                                        throws NoCLIOptionsException,
                                               UnexpectedNumCLIOptionsException,
                                               UnexpectedCLIOptionException
    {
        UserConfig user_config;
        InterestType interest_type;
        double principle;
        double rate;
        int time;

        if (args.length == 0) {
            throw new NoCLIOptionsException(NO_CLI_OPTIONS_ERROR_STR,
                                            USAGE_STR);
        }

        if (args.length != num_cli_options) {
            throw new UnexpectedNumCLIOptionsException(
                                            args.length, num_cli_options,
                                            USAGE_STR);
        }

        user_config = new UserConfig(InterestType.INVALID);

        if (!validate_user_interest_type_tag(args[0])) {
            throw new UnexpectedCLIOptionException(
                                    INTEREST_TYPE_TAG_ERROR_STR, USAGE_STR,
                                    INTEREST_TYPE_TAG, args[0]);
        }

        interest_type = parse_and_get_user_interest_type(args[1]);
        if (interest_type == InterestType.INVALID) {
            throw new UnexpectedCLIOptionException(
                                    INTEREST_TYPE_VAL_ERROR_STR, USAGE_STR,
                                    INTEREST_TYPE_OPTION_STR, args[1]);
        } else {
            user_config.set_UserInterestType(interest_type);
        }

        if (!validate_user_principle_tag(args[2])) {
            throw new UnexpectedCLIOptionException(
                                    PRINCIPLE_TAG_ERROR_STR, USAGE_STR,
                                    PRINCIPLE_TAG, args[2]);
        }

        principle = parse_and_get_principle(args[3]);
        if (principle < 0.0) {
            throw new UnexpectedCLIOptionException(
                                    PRINCIPLE_VAL_ERROR_STR, USAGE_STR,
                                    "Positive Double Value", args[3]);
        } else {
            user_config.set_UserPrinciple(principle);
        }

        if (!validate_user_rate_tag(args[4])) {
            throw new UnexpectedCLIOptionException(
                                    RATE_TAG_ERROR_STR, USAGE_STR,
                                    RATE_TAG, args[4]);
        }

        rate = parse_and_get_rate(args[5]);
        if (rate < 0.0) {
            throw new UnexpectedCLIOptionException(
                                    RATE_VAL_ERROR_STR, USAGE_STR,
                                    "Positive Double Value", args[5]);
        } else {
            user_config.set_UserRate(rate);
        }

        if (!validate_user_time_tag(args[6])) {
            throw new UnexpectedCLIOptionException(
                                    TIME_TAG_ERROR_STR, USAGE_STR,
                                    TIME_TAG, args[6]);
        }

        time = parse_and_get_time(args[7]);
        if (time < 0) {
            throw new UnexpectedCLIOptionException(
                                    TIME_VAL_ERROR_STR, USAGE_STR,
                                    "Positive Integer Value", args[7]);
        } else {
            user_config.set_UserTime(time);
        }

        return(user_config);
    }
}
