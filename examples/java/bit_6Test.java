import java.util.Objects;

public class bit_6Test {

    static void testLine7() {
        int i = 0;
        long value = 0;
        value |= 0xFFL << (8 * (7 - i));
        assert Objects.equals(value, -72057594037927936L);
    }

    static void testLine13() {
        int i = 0;
        byte[] bytes = new byte[] { (byte) 0xe0, (byte) 0x4f };
        long value = 0;
        value |= ((long) bytes[bytes.length - i - 1] & 0xFFL) << (8 * i);
        assert Objects.equals(value, 79L);
    }

    public static void main(String[] args) {
        testLine7();
        testLine13();
        System.out.println("inline tests passed: 2");
    }
}
