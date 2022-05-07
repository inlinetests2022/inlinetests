import java.util.Objects;

public class bit_16Test {

    static void testLine14() {
        int size_mod32 = 10;
        int size_mod4 = size_mod32 & 3;
        assert Objects.equals(size_mod4, 2);
    }

    static void testLine16() {
        int size_mod32 = 10;
        int remainder = size_mod32 & ~3;
        assert Objects.equals(remainder, 8);
    }

    public static void main(String[] args) {
        testLine14();
        testLine16();
        System.out.println("inline tests passed: 2");
    }
}
