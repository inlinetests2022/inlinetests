import java.util.Objects;

public class string_16Test {

    static void testLine11() {
        String flag = "#$()#$()";
        int beginning = flag.indexOf("$(");
        int end = flag.indexOf(')', beginning);
        assert Objects.equals(end, 3);
    }

    public static void main(String[] args) {
        testLine11();
        System.out.println("inline tests passed: 1");
    }
}
