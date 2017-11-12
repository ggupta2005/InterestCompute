package interest;

public class InterestFactory
{
    public Interest get_interest_object (UserConfig user_config) throws
                                                        UnsupportedInterestType
    {
        if (user_config.get_UserInterestType() == InterestType.SIMPLE) {
            return(new SimpleInterest(user_config.get_UserPrinciple(),
                                      user_config.get_UUserRate(),
                                      user_config.get_UserTime()));
        } else if (user_config.get_UserInterestType() == InterestType.COMPOUND) {
            return(new CompoundInterest(user_config.get_UserPrinciple(),
                                      user_config.get_UUserRate(),
                                      user_config.get_UserTime()));
        }

        throw new UnsupportedInterestType();
    }
}
