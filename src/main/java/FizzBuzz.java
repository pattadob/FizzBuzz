/**
 * Created by Joker on 3/22/2017.
 */
public class FizzBuzz {
    public String say(int i) {

        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();
        FizzRule fizzRule = new FizzRule();
        BuzzRule buzzRule = new BuzzRule();

        if (fizzBuzzRule.isMyRule(i)) {
            return fizzBuzzRule.say(i);
        }

        if (fizzRule.isMyRule(i)) {
            return fizzRule.say(i);
        }

        if (buzzRule.isMyRule(i)) {
            return buzzRule.say(i);
        }

        return Integer.toString(i);
    }
}
