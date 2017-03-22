
public class BuzzRule {

    public static final String SAY = "BUZZ";

    public boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    public String say(int i) {
        return isBuzz(i) ? SAY : "";
    }
}
