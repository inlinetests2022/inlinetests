import java.util.Objects;

public class string_6Test {

    static void testLine15() {
        StringBuilder sb = new StringBuilder();
        String slComment = "slcomment";
        String line = "line";
        String separator = "\t";
        sb.append(slComment).append(" ").append(line).append(separator);
        assert Objects.equals(sb.toString(), "slcomment line\t");
    }

    public static void main(String[] args) {
        testLine15();
        System.out.println("inline tests passed: 1");
    }
}
