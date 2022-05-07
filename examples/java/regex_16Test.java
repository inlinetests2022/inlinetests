import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_16Test {

    static void testLine26() {
        Pattern CONTENT_RANGE_HEADER = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
        String contentRangeHeader = "bytes 12-34/56";
        Matcher matcher = CONTENT_RANGE_HEADER.matcher(contentRangeHeader);
        assert matcher.find();
        assert Objects.equals(matcher.group(1), "12");
        assert Objects.equals(matcher.group(2), "34");
        assert Objects.equals(matcher.group(3), "56");
    }

    public static void main(String[] args) {
        testLine26();
        System.out.println("inline tests passed: 1");
    }
}
