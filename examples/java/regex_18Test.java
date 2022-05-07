import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_18Test {

    static void testLine16() {
        Pattern fsPattern = Pattern.compile("%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])");
        String s = "%33$#8.2tf";
        Matcher m = fsPattern.matcher(s);
        assert m.find();
        assert Objects.equals(m.group(1), "33$");
        assert Objects.equals(m.group(2), "#");
        assert Objects.equals(m.group(3), "8");
        assert Objects.equals(m.group(4), ".2");
        assert Objects.equals(m.group(5), "t");
        assert Objects.equals(m.group(6), "f");
    }

    public static void main(String[] args) {
        testLine16();
        System.out.println("inline tests passed: 1");
    }
}
