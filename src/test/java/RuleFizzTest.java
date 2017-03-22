import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RuleFizzTest {

    private int input;
    private String say;

    public RuleFizzTest(int input, String say) {
        this.input = input;
        this.say = say;
    }

    @Parameterized.Parameters
    public static Collection fizzNumber(){
        return Arrays.asList(new Object[][]{
                {3, FizzRule.SAY},
                {6, FizzRule.SAY}
        });
    }

    @Test
    public void FizzRuleTest(){
        FizzRule fizzRule = new FizzRule();
        assertEquals(say, fizzRule.say(input));
    }
}
