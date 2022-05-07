import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_3Test {

    static void testLine30() {
        String fieldExpression = "a.b";
        Pattern PATTERN_NESTED_FIELDS_WILDCARD = Pattern.compile("([\\p{L}_\\$][\\p{L}\\p{Digit}_\\$]*|[0-9]+)(\\.(.+))?|\\*|\\_");
        Matcher matcher = PATTERN_NESTED_FIELDS_WILDCARD.matcher(fieldExpression);
        assert matcher.find();
        assert Objects.equals(matcher.group(0), "a.b");
    }

    public static void main(String[] args) {
        testLine30();
        System.out.println("inline tests passed: 1");
    }
}
