import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: User's birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateString = scanner.nextLine();

        // Parsing the input string to LocalDate
        LocalDate birthdate = LocalDate.parse(birthdateString);

        // Calculating the age using Period class
        Period age = Period.between(birthdate, LocalDate.now());

        // Output: Displaying the calculated age
        System.out.println("Your age is: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " +
                age.getDays() + " days.");

        // Close the scanner
        scanner.close();
    }
}
