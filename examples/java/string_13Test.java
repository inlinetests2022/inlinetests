import java.util.Objects;

public class string_13Test {

    static void testLine9() {
        String yamlUser = "aaa@b.com";
        String username = yamlUser.substring(0, yamlUser.indexOf("@"));
        assert Objects.equals(username, "aaa");
    }

    static void testLine11() {
        String yamlUser = "aaa@b.com";
        String hostname = yamlUser.substring(yamlUser.indexOf("@") + 1);
        assert Objects.equals(hostname, "b.com");
    }

    public static void main(String[] args) {
        testLine9();
        testLine11();
        System.out.println("inline tests passed: 2");
    }
}
