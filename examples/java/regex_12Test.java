import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_12Test {

    static void testLine18() {
        Pattern RESOURCE_REQUEST_VALUE_PATTERN = Pattern.compile("^([0-9]+) ?([a-zA-Z]*)$");
        String propValue = "123s";
        Matcher matcher = RESOURCE_REQUEST_VALUE_PATTERN.matcher(propValue);
        assert matcher.find();
        assert Objects.equals(matcher.group(1), "123");
        assert Objects.equals(matcher.group(2), "s");
    }

    public static void main(String[] args) {
        testLine18();
        System.out.println("inline tests passed: 1");
    }
}
