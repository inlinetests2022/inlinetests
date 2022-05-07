import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_10Test {

    static void testLine18() {
        Pattern CONSTRAINT_PATTERN = Pattern.compile("api \"(.+):(.+):(.+)\"");
        String line = "api \"o.s.b:s-b:2.7\"";
        Matcher matcher = CONSTRAINT_PATTERN.matcher(line.trim());
        assert matcher.matches();
    }

    public static void main(String[] args) {
        testLine18();
        System.out.println("inline tests passed: 1");
    }
}
