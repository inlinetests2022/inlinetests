import java.util.Objects;

public class bit_15Test {

    static void testLine21() {
        char[] cs = new char[10];
        int w = 0;
        byte b = (byte) 0;
        int MASK4 = 0x0f;
        char[] BASE16 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        cs[w++] = BASE16[b >> 4 & MASK4];
        assert Objects.equals(cs[w - 1], '0');
    }

    public static void main(String[] args) {
        testLine21();
        System.out.println("inline tests passed: 1");
    }
}
