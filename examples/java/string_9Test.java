import java.util.Objects;

public class string_9Test {

    static void testLine10() {
        String item = "topic:topicConfigs";
        int i = 5;
        String topic = item.substring(0, i).trim();
        assert Objects.equals(topic, "topic");
    }

    static void testLine12() {
        String item = "topic:topicConfigs";
        int i = 5;
        String topicConfigs = item.substring(i + 1).trim();
        assert Objects.equals(topicConfigs, "topicConfigs");
    }

    public static void main(String[] args) {
        testLine10();
        testLine12();
        System.out.println("inline tests passed: 2");
    }
}
