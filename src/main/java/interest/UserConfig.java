package interest;

enum InterestType {SIMPLE, COMPOUND, INVALID};

public class UserConfig
{
    private InterestType UserInterestType;
    private double UserPrinciple;
    private double UserRate;
    private int UserTime;

    UserConfig (InterestType interest_type)
    {
        UserInterestType = interest_type;
    }

    public void set_UserInterestType (InterestType interest_type)
    {
        UserInterestType = interest_type;
    }

    public InterestType get_UserInterestType ()
    {
        return(UserInterestType);
    }

    public void set_UserPrinciple (double principle)
    {
        UserPrinciple = principle;
    }

    public double get_UserPrinciple ()
    {
        return(UserPrinciple);
    }

    public void set_UserRate (double rate)
    {
        UserRate = rate;
    }

    public double get_UUserRate ()
    {
        return(UserRate);
    }

    public void set_UserTime (int time)
    {
        UserTime = time;
    }

    public int get_UserTime ()
    {
        return(UserTime);
    }
}
