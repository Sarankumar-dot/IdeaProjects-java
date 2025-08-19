import java.io.*;
import java.util.*;

public class StudentManager {
    private static final String FILE_NAME = "students.txt";

    // Add a student to the file
    public void addStudent(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getCourse() + "," + student.getGrade());
            writer.newLine();
            System.out.println("Student added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    // Read all students from the file
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Student s = new Student(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], parts[4]);
                    students.add(s);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
        return students;
    }

    // Delete a student by ID
    public void deleteStudent(String id) {
        List<Student> students = getAllStudents();
        boolean removed = students.removeIf(s -> s.getId().equals(id));

        if (removed) {
            writeAllStudents(students);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student ID not found.");
        }
    }

    // Update a student by ID
    public void updateStudent(String id) {
        List<Student> students = getAllStudents();
        boolean found = false;

        Scanner scanner = new Scanner(System.in);

        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter new course: ");
                String course = scanner.nextLine();
                System.out.print("Enter new grade: ");
                String grade = scanner.nextLine();

                // Create new updated student
                students.set(students.indexOf(s), new Student(id, name, age, course, grade));
                found = true;
                break;
            }
        }

        if (found) {
            writeAllStudents(students);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student ID not found.");
        }
    }

    // Helper method to write all students back to the file
    private void writeAllStudents(List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                writer.write(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getCourse() + "," + s.getGrade());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
