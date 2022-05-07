import java.util.Objects;

public class bit_5Test {

    static void testLine13() {
        int len = 0x90;
        int start = 0;
        byte[] strArray = "\u00e0\u004f\u00d0\u0020\u00ea\u003a\u0069\u0010\u00a2\u00d8\u0008\u0000\u002b\u0030\u0030\u009d".getBytes();
        len = (len & 0x7F) << 8 | strArray[start++] & 0xFF;
        assert Objects.equals(len, 4291);
    }

    public static void main(String[] args) {
        testLine13();
        System.out.println("inline tests passed: 1");
    }
}
