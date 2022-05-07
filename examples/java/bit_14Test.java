import java.util.Objects;

public class bit_14Test {

    static void testLine152() {
        int[] pix = new int[] { 1, 2, 3 };
        int[] dv = new int[] { 5, 6, 7 };
        int rsum = 0;
        int gsum = 0;
        int bsum = 0;
        int yi = 0;
        // Preserve alpha channel: ( 0xff000000 & pix[yi] )
        pix[yi] = (0xff000000 & pix[yi]) | (dv[rsum] << 16) | (dv[gsum] << 8) | dv[bsum];
        assert Objects.equals(pix[yi], 328965);
    }

    public static void main(String[] args) {
        testLine152();
        System.out.println("inline tests passed: 1");
    }
}
