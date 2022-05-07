import java.util.Objects;

public class string_12Test {

    static void testLine18() {
        String sql = "CREATE TABLE MINIMAL_ENTITY (_id INTEGER PRIMARY KEY);\nINSERT INTO MINIMAL_ENTITY VALUES (1);\nINSERT INTO MINIMAL_ENTITY \nVALUES (2);";
        String[] lines = sql.split(";(\\s)*[\n\r]");
        assert Objects.equals(lines.length, 3);
    }

    public static void main(String[] args) {
        testLine18();
        System.out.println("inline tests passed: 1");
    }
}
