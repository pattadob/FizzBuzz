
public class FizzBuzzRule implements Rule {

    public static final String SAY = "FIZZBUZZ";

    public boolean isMyRule(int i) {
        FizzRule fizzRule = new FizzRule();
        BuzzRule buzzRule = new BuzzRule();
        return fizzRule.isMyRule(i) && buzzRule.isMyRule(i);
    }

    public String say(int i) {
        return isMyRule(i) ? SAY : "";
    }
}
