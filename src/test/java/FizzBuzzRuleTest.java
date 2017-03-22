import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzRuleTest {

    @Test
    public void fizzbuzzTest() {

        List<Rule> rules = Arrays.asList((Rule) new FizzBuzzRuleTest.MyRule());

        FizzBuzz fizzBuzz = new FizzBuzz(rules);

        assertEquals("MYRULE", fizzBuzz.say(0));
    }

    class MyRule implements Rule {

        public boolean isMyRule(int i) {
            return i == 0;
        }

        public String say(int i) {
            return "MYRULE";
        }
    }
}
