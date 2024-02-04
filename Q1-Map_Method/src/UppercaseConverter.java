import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseConverter {
    public static void main(String[] args) {
        Stream<String> namesStream = Stream.of("aBc", "d", "ef");

        // Using map() to convert the list of strings to uppercase
        List<String> uppercaseList = namesStream
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Displaying the result
        System.out.println("Original List: Stream of(\"aBc\", \"d\", \"ef\")");
        System.out.println("Uppercase List: " + uppercaseList);
    }
}
