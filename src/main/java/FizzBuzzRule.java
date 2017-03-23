
public class FizzBuzzRule implements Rule {

    public static final String SAY = "FIZZBUZZ";
    private FizzRule fizzRule;
    private BuzzRule buzzRule;

    public boolean isMyRule(int i) {
        fizzRule = new FizzRule();
        buzzRule = new BuzzRule();
        return fizzRule.isMyRule(i) || buzzRule.isMyRule(i);
    }

    public String say(int i) {
        fizzRule = new FizzRule();
        buzzRule = new BuzzRule();
        return fizzRule.say(i) + buzzRule.say(i);
    }
}
