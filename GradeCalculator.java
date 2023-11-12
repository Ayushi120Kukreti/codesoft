import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        float totalSubjects, totalMarks = 0, averageMarks;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of subjects: ");
        totalSubjects = scanner.nextFloat();

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.println("Enter the marks for subject " + i + ": ");
            totalMarks += scanner.nextFloat();
        }

        averageMarks = totalMarks / totalSubjects;

        if (averageMarks >= 80) {
            System.out.println("Average Marks: " + averageMarks + ", Grade A");
        } else if (averageMarks >= 60) {
            System.out.println("Average Marks: " + averageMarks + ", Grade B");
        } else if (averageMarks >= 40) {
            System.out.println("Average Marks: " + averageMarks + ", Grade C");
        } else {
            System.out.println("Average Marks: " + averageMarks + ", Grade D");
        }
    }
}
