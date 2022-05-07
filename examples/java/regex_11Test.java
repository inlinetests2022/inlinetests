import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_11Test {

    static void testLine14() {
        Pattern p = Pattern.compile("\\#\\{\\w+\\}");
        String sql = "before #{key} after";
        Matcher m = p.matcher(sql);
        assert m.find();
        assert Objects.equals(m.group(), "#{key}");
    }

    public static void main(String[] args) {
        testLine14();
        System.out.println("inline tests passed: 1");
    }
}
