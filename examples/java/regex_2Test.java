import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_2Test {

    static void testLine15() {
        String fileName = "21340506_070809_54321_ab001_bucket-1";
        Pattern pattern = Pattern.compile("\\d{8}_\\d{6}_\\d{5}_[a-z0-9]{5}_bucket-(\\d+)(?:[-_.].*)?");
        Matcher matcher = pattern.matcher(fileName);
        assert matcher.matches();
    }

    public static void main(String[] args) {
        testLine15();
        System.out.println("inline tests passed: 1");
    }
}
