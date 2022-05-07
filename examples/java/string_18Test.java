import java.util.Locale;
import java.util.Objects;

public class string_18Test {

    static void testLine14() {
        int i = 12;
        final String source = String.format(Locale.ROOT, "{\"f\":%d}", i);
        assert Objects.equals(source, "{\"f\":12}");
    }

    public static void main(String[] args) {
        testLine14();
        System.out.println("inline tests passed: 1");
    }
}
