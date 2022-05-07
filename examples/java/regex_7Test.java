import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_7Test {

    static void testLine64() {
        Pattern singlePattern = Pattern.compile("^Component\\.1.2.3_selector\\.", Pattern.CASE_INSENSITIVE);
        String s = "component.1.2.3_selector.456";
        Matcher m = singlePattern.matcher(s);
        assert m.find();
    }

    public static void main(String[] args) {
        testLine64();
        System.out.println("inline tests passed: 1");
    }
}
