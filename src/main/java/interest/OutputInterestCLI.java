package interest;

public class OutputInterestCLI
{
    public static void output_interest_details (Interest interest) throws
                                                        UnsupportedInterestType
    {
        if (interest instanceof SimpleInterest) {
            System.out.println("The computed simple interest is following");
        } else if (interest instanceof CompoundInterest) {
            System.out.println("The computed compound interest is following");
        } else {
            throw new UnsupportedInterestType();
        }

        System.out.println("\tThe principle is: " +
                                    interest.get_principle());
        System.out.println("\tThe interest rate is " +
                                    interest.get_interest_rate());
        System.out.println("\tThe time duration is " +
                                    interest.get_interest_duration());
        System.out.println("\tThe interest is " +
                                    interest.get_interest());
        System.out.println("\tThe total amount is " +
                                    interest.get_total_amount());
    }
}
