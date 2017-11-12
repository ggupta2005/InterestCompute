package interest;

public class UnexpectedCLIOptionException extends ParseCLIOptionException
{
    private String ExpectedParameter;
    private String ActualParameter;

    UnexpectedCLIOptionException (String error_str, String usage_str,
                                  String expected_parameter,
                                  String actual_parameter)
    {
        super(error_str, usage_str);
        ExpectedParameter = expected_parameter;
        ActualParameter = actual_parameter;
    }

    public String get_ExpectedParameter () {
        return(ExpectedParameter);
    }

    public String get_ActualParameter () {
        return(ActualParameter);
    }
}
