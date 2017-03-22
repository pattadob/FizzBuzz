import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RuleBuzzTest {

    private int input;
    private String say;

    public RuleBuzzTest(int input, String say) {
        this.input = input;
        this.say = say;
    }

    @Parameterized.Parameters
    public static Collection fizzNumber(){
        return Arrays.asList(new Object[][]{
                {5, BuzzRule.SAY},
                {10, BuzzRule.SAY}
        });
    }

    @Test
    public void FizzRuleTest(){
        BuzzRule buzzRule = new BuzzRule();
        assertEquals(say, buzzRule.say(input));
    }
}
