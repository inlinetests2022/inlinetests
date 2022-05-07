import java.util.Objects;

public class bit_11Test {

    static void testLine6() {
        byte[] b = "abcdefghijklmn".getBytes();
        int offset = 1;
        long v = b[offset + 7];
        int i = 6;
        v = (v << 8) | (b[offset + i] & 0xff);
        assert Objects.equals(v, 26984L);
    }

    public static void main(String[] args) {
        testLine6();
        System.out.println("inline tests passed: 1");
    }
}
