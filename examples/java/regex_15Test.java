import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_15Test {

    static void testLine20() {
        Pattern hiddenParamPattern = Pattern.compile("(.*):([0-9]+)");
        String op = "op:36";
        Matcher matcher = hiddenParamPattern.matcher(op);
        assert matcher.matches();
    }

    public static void main(String[] args) {
        testLine20();
        System.out.println("inline tests passed: 1");
    }
}
