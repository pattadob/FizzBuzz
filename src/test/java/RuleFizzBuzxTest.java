import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RuleFizzBuzxTest {

    private int input;
    private String say;

    public RuleFizzBuzxTest(int input, String say) {
        this.input = input;
        this.say = say;
    }

    @Parameterized.Parameters
    public static Collection fizzNumber(){
        return Arrays.asList(new Object[][]{
                {15, FizzBuzzRule.SAY},
                {30, FizzBuzzRule.SAY}
        });
    }

    @Test
    public void FizzRuleTest(){
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();
        assertEquals(say, fizzBuzzRule.say(input));
    }
}
