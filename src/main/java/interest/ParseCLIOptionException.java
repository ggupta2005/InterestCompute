package interest;

public class ParseCLIOptionException extends Exception
{
    private String ErrorStr;
    private String UsageStr;

    ParseCLIOptionException (String error_str, String usage_str)
    {
        ErrorStr = error_str;
        UsageStr = usage_str;
    }

    public String get_ErrorStr ()
    {
        return(ErrorStr);
    }

    public String get_UsageStr ()
    {
        return(UsageStr);
    }
}