import java.util.Scanner;

public class IT24100499Lab7Q1A{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int i;
        double marks = 0.0;
        double totalMarks = 0.0;

        System.out.println("Enter the marks for four subjects:");

        // Loop to read marks for each subject
        for (i = 1; i <= 4; i++) {
            System.out.print("Enter subject " + i + " marks: ");
            marks = scanner.nextDouble();
            totalMarks += marks;
        }

        // Calculate the average after all marks are entered
        double average = totalMarks / 4;

        System.out.println("\nThe average marks is: " + average);

        // Determine and print grade based on calculated average
        if (average >= 75) {
            System.out.println("Overall Grade is: Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is: Credit");
        } else {
            System.out.println("Overall Grade is: Fail");
        }

        scanner.close(); // Close the Scanner to avoid resource leaks
    }
}