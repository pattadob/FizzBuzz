import java.util.List;

public class FizzBuzz {

    private List<Rule> rules;

    public FizzBuzz(List<Rule> rules) {
        this.rules = rules;
    }

    public String say(int i) {

        for (Rule rule : rules) {
            if (rule.isMyRule(i)) {
                return rule.say(i);
            }
        }
        return Integer.toString(i);
    }
}
