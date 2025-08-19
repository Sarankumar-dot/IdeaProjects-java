import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n=== Student Record Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine();

                    Student s = new Student(id, name, age, course, grade);
                    manager.addStudent(s);
                    break;

                case "2":
                    List<Student> students = manager.getAllStudents();
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n--- Student Records ---");
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case "3":
                    System.out.print("Enter the ID of the student to update: ");
                    String updateId = scanner.nextLine();
                    manager.updateStudent(updateId);
                    break;

                case "4":
                    System.out.print("Enter the ID of the student to delete: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteStudent(deleteId);
                    break;

                case "5":
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
