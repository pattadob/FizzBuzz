import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void fizzbuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("FIZZ", fizzBuzz.say(3));
        assertEquals("BUZZ", fizzBuzz.say(5));
        assertEquals("FIZZBUZZ", fizzBuzz.say(15));
    }
}
