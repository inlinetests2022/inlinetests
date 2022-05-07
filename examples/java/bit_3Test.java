import java.util.Objects;

public class bit_3Test {

    static void testLine21() {
        int j = 0;
        byte[] c = new byte[512];
        int MASK_INT_LOWEST_BYTE = 0x000000FF;
        int r = ((int) c[j++]) & MASK_INT_LOWEST_BYTE;
        assert Objects.equals(r, 0);
    }

    static void testLine25() {
        int r = 1;
        int g = 1;
        int b = 1;
        int i = 0;
        int[] tab = new int[512];
        tab[i++] = 0xFF000000 | (r << 16) | (g << 8) | b;
        assert Objects.equals(tab[i - 1], -16711423);
    }

    public static void main(String[] args) {
        testLine21();
        testLine25();
        System.out.println("inline tests passed: 2");
    }
}
