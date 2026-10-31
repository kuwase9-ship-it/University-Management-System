package Lab3;

import Lab1.Student;
import Lab1.Undergraduate;
import Lab1.Course;
import java.util.*;

public class UniversityApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        Set<String> courseCodes = new HashSet<>();
        Map<String, String> enrollments = new HashMap<>();

        while (true) {
            System.out.println("\n=== UNIVERSITY MANAGEMENT - LAB 3 ===");
            System.out.println("1. Add Student  2. List Students  3. Add Course");
            System.out.println("4. Enroll Student  5. View Enrollments  6. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Reg No: "); String reg = sc.nextLine();
                        System.out.print("Name: "); String name = sc.nextLine();
                        System.out.print("Email: "); String email = sc.nextLine();
                        students.add(new Undergraduate(reg, name, email));
                        System.out.println("Student Added!");
                        break;
                    case 2:
                        for (Student s : students) System.out.println(s);
                        break;
                    case 3:
                        System.out.print("Course Code: "); String code = sc.nextLine();
                        courseCodes.add(code);
                        System.out.println("Course Added: " + code);
                        break;
                    case 4:
                        System.out.print("Enter Reg No: "); String r = sc.nextLine();
                        System.out.print("Enter Course Code: "); String c = sc.nextLine();
                        enrollments.put(r, c);
                        System.out.println("Enrolled!");
                        break;
                    case 5:
                        enrollments.forEach((s, co) -> System.out.println(s + " -> " + co));
                        break;
                    case 6: return;
                    default: System.out.println("Invalid");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
