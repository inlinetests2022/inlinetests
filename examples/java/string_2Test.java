import java.util.Objects;

public class string_2Test {

    static void testLine10() {
        String[] escapes = new String[] { "trnf", "\t\r\n\f" };
        int character = 't';
        int escapeIndex = escapes[0].indexOf(character);
        assert Objects.equals(escapeIndex, 0);
    }

    public static void main(String[] args) {
        testLine10();
        System.out.println("inline tests passed: 1");
    }
}
