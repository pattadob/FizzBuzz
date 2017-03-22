import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzbuzzTest() {

        List<Rule> rules = Arrays.asList(new FizzBuzzRule(), new FizzRule(), new BuzzRule());

        FizzBuzz fizzBuzz = new FizzBuzz(rules);
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("FIZZ", fizzBuzz.say(3));
        assertEquals("BUZZ", fizzBuzz.say(5));
        assertEquals("FIZZBUZZ", fizzBuzz.say(15));
    }
}
