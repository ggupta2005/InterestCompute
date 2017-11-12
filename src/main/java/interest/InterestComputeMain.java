package interest;

public class InterestComputeMain
{
    public static void main( String[] args )
    {
        UserConfig user_config;
        InterestFactory interest_factory;

        System.out.println( "Interest Compute Software" );

        try {
            user_config = ParseCLIOptions.parse_cli_options(args, 8);

            interest_factory = new InterestFactory();

            try {
                Interest interest =
                    interest_factory.get_interest_object(user_config);

                OutputInterestCLI.output_interest_details(interest);

            } catch (UnsupportedInterestType unsup_interest_type) {

            }

        } catch (NoCLIOptionsException no_cli_option_exception) {

            System.out.println(no_cli_option_exception.get_ErrorStr());
            System.out.println(no_cli_option_exception.get_UsageStr());

        } catch (UnexpectedNumCLIOptionsException
                                      num_cli_option_exception) {

            System.out.println(num_cli_option_exception.get_ErrorStr());
            System.out.println(num_cli_option_exception.get_UsageStr());
        } catch (UnexpectedCLIOptionException
                               unexcepted_cli_option_exception) {
            System.out.println(
                        unexcepted_cli_option_exception.get_ErrorStr());
            System.out.println("\tThe received CLI option is: " +
                unexcepted_cli_option_exception.get_ActualParameter());
            System.out.println("\tThe expected CLI option is: " +
                unexcepted_cli_option_exception.get_ExpectedParameter());
            System.out.println(
                        unexcepted_cli_option_exception.get_UsageStr());

        }
    }
}
