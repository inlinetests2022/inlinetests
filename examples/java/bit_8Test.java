import java.util.Objects;

public class bit_8Test {

    static void testLine11() {
        int len = 128;
        len = len & 0x7F;
        assert Objects.equals(len, 0);
    }

    static void testLine14() {
        int curr = 128;
        int shift = 7;
        int len = 0;
        len |= (curr & 0x7F) << shift;
        assert Objects.equals(len, 0);
    }

    public static void main(String[] args) {
        testLine11();
        testLine14();
        System.out.println("inline tests passed: 2");
    }
}
