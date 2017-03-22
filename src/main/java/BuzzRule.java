
public class BuzzRule {

    public static final String SAY = "BUZZ";

    public boolean isMyRule(int i) {
        return i % 5 == 0;
    }

    public String say(int i) {
        return isMyRule(i) ? SAY : "";
    }
}
