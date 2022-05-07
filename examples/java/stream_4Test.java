import java.util.stream.Stream;
import java.util.Objects;

public class stream_4Test {

    static void testLine9() {
        String[] existingNames = new String[] { "a", "hello", "world" };
        Stream<String> detectedNames = Stream.of("have", "a", "good", "day");
        Stream<String> mergedNames = (existingNames != null ? Stream.concat(Stream.of(existingNames), detectedNames) : detectedNames);
        assert Objects.equals(mergedNames.count(), 7L);
    }

    public static void main(String[] args) {
        testLine9();
        System.out.println("inline tests passed: 1");
    }
}
