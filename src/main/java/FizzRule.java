
public class FizzRule {

    public static final String SAY = "FIZZ";

    public boolean isFizz(int i) {
        return i % 3 == 0;
    }

    public String say(int i) {
        return isFizz(i) ? SAY : "";
    }
}
