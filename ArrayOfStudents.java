import java.util.Scanner;
class Student {
    String name;
    int score;
    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class ArrayOfStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter score of student " + (i + 1) + ": ");
            int score = scanner.nextInt();
            scanner.nextLine();            
            students[i] = new Student(name, score);
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + students[i].name + " - " + students[i].score);
        }

        scanner.close();
    }
}
