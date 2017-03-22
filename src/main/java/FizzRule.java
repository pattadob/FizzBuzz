
public class FizzRule implements Rule{

    public static final String SAY = "FIZZ";

    public boolean isMyRule(int i) {
        return i % 3 == 0;
    }

    public String say(int i) {
        return isMyRule(i) ? SAY : "";
    }
}
