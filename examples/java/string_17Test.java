import java.util.Objects;

public class string_17Test {

    static void testLine20() {
        String titleStr = "I am a Title\n\nAnd:  Subtitle\n";
        titleStr = titleStr.replace("\n", " ").replaceAll(" +", " ").trim();
        assert Objects.equals(titleStr, "I am a Title And: Subtitle");
    }

    public static void main(String[] args) {
        testLine20();
        System.out.println("inline tests passed: 1");
    }
}
