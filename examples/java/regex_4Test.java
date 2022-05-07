import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_4Test {

    static void testLine16() {
        Pattern patternKeepIncludes = Pattern.compile(".*^\\s*?//\\s*?KEEP INCLUDES.*?\n(.*?)^\\s*// KEEP INCLUDES END.*?\n", Pattern.DOTALL | Pattern.MULTILINE);
        String contents = "// KEEP INCLUDES\nabc\n// KEEP INCLUDES END\n";
        Matcher matcher = null;
        matcher = patternKeepIncludes.matcher(contents);
        assert matcher.matches();
    }

    public static void main(String[] args) {
        testLine16();
        System.out.println("inline tests passed: 1");
    }
}
