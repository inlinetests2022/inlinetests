import java.util.Objects;

public class bit_7Test {

    static void testLine18() {
        long i = 2147483648L;
        long q = 21474836L;
        int r = 0;
        // really: r = i - (q * 100);
        r = (int) (i - ((q << 6) + (q << 5) + (q << 2)));
        assert Objects.equals(r, 48);
    }

    static void testLine40() {
        int i2 = 30;
        int q2 = 0;
        q2 = (i2 * 52429) >>> (16 + 3);
        assert Objects.equals(q2, 3);
    }

    public static void main(String[] args) {
        testLine18();
        testLine40();
        System.out.println("inline tests passed: 2");
    }
}
