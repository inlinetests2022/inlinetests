import java.util.Objects;

public class bit_10Test {

    static void testLine46() {
        long k1 = 0;
        byte[] data = "abcdefghijklmn".getBytes();
        int offset = 0;
        int tailStart = 7;
        k1 ^= ((long) data[offset + tailStart + 6] & 0xff) << 48;
        assert Objects.equals(k1, 30962247438172160L);
    }

    public static void main(String[] args) {
        testLine46();
        System.out.println("inline tests passed: 1");
    }
}
