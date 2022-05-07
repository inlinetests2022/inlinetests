import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_14Test {

    static void testLine21() {
        String CONF_USERS = ".users";
        String CONF_GROUPS = ".groups";
        String prefixRegEx = "config\\.aaa";
        String usersGroupsRegEx = prefixRegEx + "[\\S]*(" + Pattern.quote(CONF_USERS) + "|" + Pattern.quote(CONF_GROUPS) + ")";
        assert Objects.equals(usersGroupsRegEx, "config\\.aaa[\\S]*(\\Q.users\\E|\\Q.groups\\E)");
    }

    public static void main(String[] args) {
        testLine21();
        System.out.println("inline tests passed: 1");
    }
}
