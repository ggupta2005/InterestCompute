package interest;

public class CompoundInterest extends Interest
{
    private double Principle;
    private double InterestRate;
    private int Time;

    CompoundInterest (double principle, double rate, int time)
    {
        Principle = principle;
        InterestRate = rate;
        Time = time;
    }

    public double get_interest ()
    {
        return(get_total_amount() - Principle);
    }

    public double get_total_amount ()
    {
        return(Principle * (Math.pow(1.0 + (InterestRate/100.0), Time * 1.0)));
    }

    public double get_principle ()
    {
        return(Principle);
    }

    public double get_interest_rate ()
    {
        return(InterestRate);
    }

    public int get_interest_duration ()
    {
        return(Time);
    }
}
