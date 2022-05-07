import java.util.Objects;

public class string_7Test {

    static void testLine20() {
        String[] lines = new String[] { "line0", "line1 01 \t 02" };
        String id = lines[1].trim().substring(0, lines[1].trim().indexOf("\t"));
        assert Objects.equals(id, "line1 01 ");
    }

    public static void main(String[] args) {
        testLine20();
        System.out.println("inline tests passed: 1");
    }
}
