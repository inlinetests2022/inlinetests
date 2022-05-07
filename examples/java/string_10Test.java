import java.util.Objects;

public class string_10Test {

    static void testLine21() {
        String endpointDescription = "localhost:22";
        int sshPort = Integer.parseInt(endpointDescription.split(":")[1]);
        assert Objects.equals(sshPort, 22);
    }

    static void testLine23() {
        String endpointDescription = "localhost:22";
        String sshHost = endpointDescription.split(":")[0];
        assert Objects.equals(sshHost, "localhost");
    }

    public static void main(String[] args) {
        testLine21();
        testLine23();
        System.out.println("inline tests passed: 2");
    }
}
