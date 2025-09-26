import java.util.*;

public class StudentRecordSystem {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Student> studentList = new ArrayList<>();
    private static final HashMap<Integer, Student> studentMap = new HashMap<>();

    // Create (Add Student)
    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear newline

        if (studentMap.containsKey(id)) {
            System.out.println("⚠️ Student with this ID already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        Student student = new Student(id, name, age, course);
        studentList.add(student);
        studentMap.put(id, student);

        System.out.println("✅ Student added successfully!");
    }

    // Read (View Students)
    public static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\n--- Student Records ---");
            for (Student s : studentList) {
                System.out.println(s);
            }
            System.out.println("-----------------------\n");
        }
    }

    // Update Student
    public static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = studentMap.get(id);
        if (student == null) {
            System.out.println("⚠️ Student not found!");
            return;
        }

        System.out.print("Enter new Name (leave blank to keep current): ");
        String name = sc.nextLine();
        if (!name.isEmpty()) student.setName(name);

        System.out.print("Enter new Age (0 to keep current): ");
        int age = sc.nextInt();
        sc.nextLine();
        if (age > 0) student.setAge(age);

        System.out.print("Enter new Course (leave blank to keep current): ");
        String course = sc.nextLine();
        if (!course.isEmpty()) student.setCourse(course);

        System.out.println("✅ Student updated successfully!");
    }

    // Delete Student
    public static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = studentMap.remove(id);
        if (student == null) {
            System.out.println("⚠️ Student not found!");
        } else {
            studentList.remove(student);
            System.out.println("✅ Student deleted successfully!");
        }
    }

    // Search Student
    public static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = studentMap.get(id);
        if (student == null) {
            System.out.println("⚠️ Student not found!");
        } else {
            System.out.println("🔎 Found: " + student);
        }
    }

    // Main Menu
    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Student Record System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: searchStudent(); break;
                case 6: System.out.println("Exiting... Goodbye!"); return;
                default: System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
