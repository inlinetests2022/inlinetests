import java.util.Objects;

public class string_4Test {

    static void testLine20() {
        String stringVal = null;
        String text = "//*";
        int mark = 0;
        int startHintSp = 1;
        int starIndex = 2;
        // stringVal = this.subString(mark + startHintSp, starIndex - startHintSp - mark);
        stringVal = text.substring(mark + startHintSp, mark + startHintSp + starIndex - startHintSp - mark);
        assert Objects.equals(stringVal, "/");
    }

    public static void main(String[] args) {
        testLine20();
        System.out.println("inline tests passed: 1");
    }
}
