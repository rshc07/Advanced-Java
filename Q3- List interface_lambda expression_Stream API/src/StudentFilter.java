import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {
    public static void main(String[] args) {
        // Create a list of student names
        List<String> studentNames = Arrays.asList("Hemz", "Meena", "Balaji", "Thanish", "Thanila", "Dev", "Chandran", "Baby", "Anamika", "Annadurai");

        // Use Stream API to filter students whose names start with "A"
        List<String> studentsWithA = studentNames.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

        // Output lines
        System.out.println("Original List of Students: " + studentNames);
        System.out.println("Students whose names start with 'A': " + studentsWithA);
    }
}
