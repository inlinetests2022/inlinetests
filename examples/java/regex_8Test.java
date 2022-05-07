import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_8Test {

    static void testLine28() {
        Pattern TAG_PATTERN = Pattern.compile("tag:(\"[^\"]+\"|\\S+)", Pattern.CASE_INSENSITIVE);
        StringBuilder query = new StringBuilder("tag:\"abc\"");
        Matcher tagMatcher = TAG_PATTERN.matcher(query);
        assert tagMatcher.find();
        assert Objects.equals(tagMatcher.group(1), "\"abc\"");
    }

    public static void main(String[] args) {
        testLine28();
        System.out.println("inline tests passed: 1");
    }
}
