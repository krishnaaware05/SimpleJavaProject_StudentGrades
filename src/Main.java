import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Grades Program");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int subjects = 3;
        int[] marks = new int[subjects];
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i+1) + " (0-100): ");
            while (!sc.hasNextInt()) {
                System.out.print("Please enter an integer (0-100): ");
                sc.next();
            }
            int m = sc.nextInt();
            if (m < 0) m = 0;
            if (m > 100) m = 100;
            marks[i] = m;
        }

        int total = 0;
        for (int m : marks) total += m;
        double average = total / (double) subjects;

        String grade;
        if (average >= 90) grade = "A";
        else if (average >= 75) grade = "B";
        else if (average >= 50) grade = "C";
        else grade = "F";

        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade: " + grade);
    }
}
