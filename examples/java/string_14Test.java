import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class string_14Test {

    static void testLine15() {
        String formatStr = "yyyy\\-MM-dd";
        formatStr = formatStr.replaceAll("\\\\-", "-");
        assert Objects.equals(formatStr, "yyyy-MM-dd");
    }

    static void testLine31() {
        String formatStr = "3 AM";
        Matcher amPmMatcher = Pattern.compile("(([AP])[M/P]*)|(([上下])[午/下]*)", Pattern.CASE_INSENSITIVE).matcher(formatStr);
        formatStr = amPmMatcher.replaceAll("@");
        assert Objects.equals(formatStr, "3 @");
    }

    public static void main(String[] args) {
        testLine15();
        testLine31();
        System.out.println("inline tests passed: 2");
    }
}
