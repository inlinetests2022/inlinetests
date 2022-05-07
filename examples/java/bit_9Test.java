import java.util.Objects;

public class bit_9Test {

    static void testLine24() {
        int c1 = 0;
        int off = 0;
        byte[] d = "abcd".getBytes();
        c1 = d[off++] & 0xff;
        assert Objects.equals(c1, 97);
    }

    static void testLine27() {
        int c1 = 97;
        c1 = (c1 & 0x03) << 4;
        assert Objects.equals(c1, 16);
    }

    static void testLine33() {
        int c2 = 0;
        int off = 1;
        byte[] d = "abcd".getBytes();
        c2 = d[off++] & 0xff;
        assert Objects.equals(c2, 98);
    }

    static void testLine35() {
        int c1 = 16;
        int c2 = 98;
        c1 |= (c2 >> 4) & 0x0f;
        assert Objects.equals(c1, 22);
    }

    static void testLine38() {
        int c1 = 22;
        int c2 = 98;
        c1 = (c2 & 0x0f) << 2;
        assert Objects.equals(c1, 8);
    }

    public static void main(String[] args) {
        testLine24();
        testLine27();
        testLine33();
        testLine35();
        testLine38();
        System.out.println("inline tests passed: 5");
    }
}
