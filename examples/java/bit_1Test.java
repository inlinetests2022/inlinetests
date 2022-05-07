import java.util.Objects;

public class bit_1Test {

    static void testLine10() {
        char[] out = new char[4];
        int i = 0;
        int j = 0;
        byte[] data = "\u00e0\u004f\u00d0\u0020\u00ea\u003a\u0069\u0010\u00a2\u00d8\u0008\u0000\u002b\u0030\u0030\u009d".getBytes();
        char[] DIGITS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
        assert Objects.equals(out[j - 1], 'c');
    }

    static void testLine21() {
        char[] out = new char[4];
        int i = 0;
        int j = 0;
        byte[] data = "\u00e0\u004f\u00d0\u0020\u00ea\u003a\u0069\u0010\u00a2\u00d8\u0008\u0000\u002b\u0030\u0030\u009d".getBytes();
        char[] DIGITS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        /*
             * char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b',
             * 'c', 'd', 'e', 'f'};
             * byte[] data =
             * "\u00e0\u004f\u00d0\u0020\u00ea\u003a\u0069\u0010\u00a2\u00d8\u0008\u0000\u002b\u0030\u0030\u009d"
             * .getBytes();
             * int i = 0;
             * int j = 0;
             */
        out[j++] = DIGITS[0x0F & data[i]];
        assert Objects.equals(out[j - 1], '3');
    }

    public static void main(String[] args) {
        testLine10();
        testLine21();
        System.out.println("inline tests passed: 2");
    }
}
