import java.util.Objects;

public class string_3Test {

    static void testLine21() {
        String requestUri = "/api/v1/namespaces/default";
        int index = requestUri.lastIndexOf('/') + 1;
        assert Objects.equals(index, 19);
    }

    static void testLine23() {
        String requestUri = "/api/v1/namespaces/default";
        int index = 0;
        String filename = requestUri.substring(index);
        assert Objects.equals(filename, "/api/v1/namespaces/default");
    }

    public static void main(String[] args) {
        testLine21();
        testLine23();
        System.out.println("inline tests passed: 2");
    }
}
