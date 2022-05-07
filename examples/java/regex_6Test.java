import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_6Test {

    static void testLine19() {
        String realTableName = "name";
        String tableName = "";
        String key = "name.aaa";
        // original statement: String pattern = "^" + (StringUtil.isEmpty(realTableName, true) ? tableName : realTableName) + "\\." + "[a-zA-Z]+$";
        String pattern = "^" + (realTableName.equals("") ? tableName : realTableName) + "\\." + "[a-zA-Z]+$";
        assert Pattern.matches(pattern, key);
    }

    public static void main(String[] args) {
        testLine19();
        System.out.println("inline tests passed: 1");
    }
}
