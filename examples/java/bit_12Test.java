import java.util.Objects;

public class bit_12Test {

    static void testLine12() {
        byte[] bytes = "aaa".getBytes();
        int offset = 0;
        int value = 0;
        value = (value << 8) | (bytes[offset] & 0xFF);
        assert Objects.equals(value, 97);
    }

    public static void main(String[] args) {
        testLine12();
        System.out.println("inline tests passed: 1");
    }
}
