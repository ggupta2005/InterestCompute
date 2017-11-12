package interest;

public class SimpleInterest extends Interest
{
    private double Principle;
    private double InterestRate;
    private int Time;

    SimpleInterest (double principle, double rate, int time)
    {
        Principle = principle;
        InterestRate = rate;
        Time = time;
    }

    public double get_interest ()
    {
        return((Principle * InterestRate * Time) / 100.0);
    }

    public double get_total_amount ()
    {
        return(Principle + get_interest());
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
