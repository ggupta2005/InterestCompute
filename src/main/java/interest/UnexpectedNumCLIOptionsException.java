package interest;

public class UnexpectedNumCLIOptionsException extends ParseCLIOptionException
{
    UnexpectedNumCLIOptionsException (int num_actual_cli_parameters,
                                      int num_expected_cli_parameters,
                                      String usage_str)
    {
        super("Expecting " + num_expected_cli_parameters +
              " CLI parameters " + "but got " +
              num_actual_cli_parameters, usage_str);

        //Log a statement saying that unexpected number of line options
        //were provided
    }
}
