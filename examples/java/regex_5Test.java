import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_5Test {

    static void testLine19() {
        Pattern BROKER_PATTERN = Pattern.compile("Broker_(.*)_(\\d+)");
        String brokerToParse = "Broker_a_1";
        Matcher matcher = BROKER_PATTERN.matcher(brokerToParse);
        assert matcher.matches();
    }

    public static void main(String[] args) {
        testLine19();
        System.out.println("inline tests passed: 1");
    }
}
