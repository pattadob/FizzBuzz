
public class FizzBuzzRule {

    public static final String SAY = "FIZZBUZZ";

    public boolean isFizzBuzz(int i) {
        FizzRule fizzRule = new FizzRule();
        BuzzRule buzzRule = new BuzzRule();
        return fizzRule.isFizz(i) && buzzRule.isBuzz(i);
    }

    public String say(int i) {
        return isFizzBuzz(i) ? SAY : "";
    }
}
