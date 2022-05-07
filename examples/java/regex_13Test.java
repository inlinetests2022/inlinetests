import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_13Test {

    static void testLine22() {
        Pattern newLinePattern = Pattern.compile("([^\r\n]*)([\r\n]*\n)?(\r+)?");
        String str = "something\n\r";
        // part not matched would be silently dropped.
        Matcher m = newLinePattern.matcher(str);
        assert m.find();
        assert Objects.equals(m.group(1), "something");
        assert Objects.equals(m.group(2), "\n");
        assert Objects.equals(m.group(3), "\r");
    }

    public static void main(String[] args) {
        testLine22();
        System.out.println("inline tests passed: 1");
    }
}
