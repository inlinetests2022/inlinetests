import java.util.Objects;

public class bit_4Test {

    static void testLine13() {
        int accum = 0;
        byte[] b = "\u00e0\u004f\u00d0\u0020\u00ea\u003a\u0069\u0010\u00a2\u00d8\u0008\u0000\u002b\u0030\u0030\u009d".getBytes();
        accum = accum | (b[0] & 0xff) << 0;
        assert Objects.equals(accum, 195);
    }

    public static void main(String[] args) {
        testLine13();
        System.out.println("inline tests passed: 1");
    }
}
