import java.util.stream.Stream;
import java.util.List;
import static java.util.stream.Collectors.*;
import java.util.Arrays;
import stream_13.*;
import java.util.Objects;

public class stream_13Test {

    static void testLine15() {
        List<Expression> children = Arrays.asList(new Expression[] { new SqlCallExpression("SELECT MIN(Price) AS SmallestPrice FROM Products; "), new SqlCallExpression("SELECT COUNT(ProductID) FROM Products;") });
        List<String> aliases = children.subList(1, children.size()).stream().map(alias -> ExpressionUtils.extractValue(alias, String.class).orElseThrow(() -> new ValidationException("Unexpected alias: " + alias))).collect(toList());
        assert Objects.equals(aliases, Arrays.asList("SELECT COUNT(ProductID) FROM Products;"));
    }

    public static void main(String[] args) {
        testLine15();
        System.out.println("inline tests passed: 1");
    }
}
