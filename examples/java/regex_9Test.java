import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_9Test {

    static void testLine18() {
        Pattern ROUTE_PATTERN = Pattern.compile("([&!=,]*)\\s*([^&!=,\\s]+)");
        String rule = "&abc";
        final Matcher matcher = ROUTE_PATTERN.matcher(rule);
        assert matcher.find();
        assert Objects.equals(matcher.group(1), "&");
        assert Objects.equals(matcher.group(2), "abc");
    }

    public static void main(String[] args) {
        testLine18();
        System.out.println("inline tests passed: 1");
    }
}
