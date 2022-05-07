import java.util.Objects;

public class bit_13Test {

    static void testLine11() {
        long[] words = new long[] { 1L, 2L };
        long h = 1234L;
        int i = words.length - 1;
        h ^= words[i] * (i + 1);
        assert Objects.equals(h, 1238L);
    }

    public static void main(String[] args) {
        testLine11();
        System.out.println("inline tests passed: 1");
    }
}
