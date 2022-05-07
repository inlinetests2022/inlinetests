import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;

public class regex_17Test {

    static void testLine10() {
        Pattern pattern = Pattern.compile("(.*)&t=(\\d+)");
        String url = "https://www.youtube.com/watch?v=video_id&t=890";
        final Matcher matcher = pattern.matcher(url);
        assert matcher.matches();
        assert Objects.equals(matcher.group(2), "890");
    }

    public static void main(String[] args) {
        testLine10();
        System.out.println("inline tests passed: 1");
    }
}
