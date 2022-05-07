import java.util.Objects;

public class string_19Test {

    static void testLine22() {
        String nodeVal = "a";
        String outputLine = "";
        /*
             * Reporting volume information for specific DataNode(s)
             */
        outputLine = String.format("Reporting volume information for DataNode(s). " + "These DataNode(s) are parsed from '%s'.", nodeVal);
        assert Objects.equals(outputLine, "Reporting volume information for DataNode(s). These DataNode(s) are parsed from 'a'.");
    }

    public static void main(String[] args) {
        testLine22();
        System.out.println("inline tests passed: 1");
    }
}
