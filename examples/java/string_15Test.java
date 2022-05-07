import java.util.Objects;

public class string_15Test {

    static void testLine11() {
        String lib = "lib134/$ISA/256";
        int i = lib.indexOf("/$ISA/");
        // replace "/$ISA/" with "/"
        String prefix = lib.substring(0, i);
    }

    public static void main(String[] args) {
        testLine11();
        System.out.println("inline tests passed: 1");
    }
}
