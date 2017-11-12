package interest;

public class NoCLIOptionsException extends ParseCLIOptionException
{
    NoCLIOptionsException (String no_cli_options_error_str,
                           String usage_str)
    {
        super(no_cli_options_error_str, usage_str);
        //Log a statement saying that no command line options were provided
    }
}
