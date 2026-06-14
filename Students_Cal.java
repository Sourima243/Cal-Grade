 import java.util.Scanner;

public class Students_Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double total = 0, average;
        char grade;

        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        n = sc.nextInt();

        double[] marks = new double[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextDouble();
            total += marks[i];
        }

        // Calculate average percentage
        average = total / n;

        // Grade calculation
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else if (average >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}

