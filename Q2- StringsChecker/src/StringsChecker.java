import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsChecker {
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("abc", "", "be", "efg", "abcd", "", "jkl");

        // Functions to get non-empty strings
        List<String> nonEmptyStringsList = stringsList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

        // Output Lines
        System.out.println("Original List: " + stringsList);
        System.out.println("List with Non-Empty Strings: " + nonEmptyStringsList);
    }
}
