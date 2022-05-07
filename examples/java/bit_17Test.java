import java.util.Objects;

public class bit_17Test {

    static void testLine8() {
        byte in0 = (byte) 0;
        int third = (in0 & 0x7C) >> 2;
        assert Objects.equals(third, 0);
    }

    public static void main(String[] args) {
        testLine8();
        System.out.println("inline tests passed: 1");
    }
}
