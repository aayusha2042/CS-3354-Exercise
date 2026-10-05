import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Demonstrates Java Collections using Student objects.
 *
 * @author Aayusha Adhikari
 * @version 1.0
 */
public class StudentCollectionDemo {

    /**
     * Runs the Student Collection Management System.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println(
                "========== STUDENT COLLECTION MANAGEMENT SYSTEM ==========");

        // Create an ArrayList of students
        List<Student> students = new ArrayList<Student>();

        students.add(new Student(101, "Maya", "Computer Science", 3.8));
        students.add(new Student(102, "Daniel", "Biology", 2.3));
        students.add(new Student(103, "Sophia", "Business", 3.5));
        students.add(new Student(104, "Ethan", "Mathematics", 2.1));
        students.add(new Student(105, "Olivia", "Nursing", 3.9));
        students.add(new Student(106, "Noah", "Engineering", 3.2));

        System.out.println("\n1. Original Student List");

        for (Student student : students) {
            System.out.println(student);
        }
System.out.println("\n2. ArrayList Operations");

        Student newStudent = new Student(107, "Liam", "Chemistry", 3.4);
        students.add(newStudent);
        System.out.println("Added: " + newStudent);

        System.out.println("Student at index 0: " + students.get(0));

        Student replacementStudent =
                new Student(108, "Emma", "Psychology", 3.6);

        students.set(1, replacementStudent);
        System.out.println("Replaced student at index 1 with: "
                + replacementStudent);

        System.out.println("Contains Liam: "
                + students.contains(newStudent));

        System.out.println("Number of students: "
                + students.size());

        System.out.println("Is the list empty? "
                + students.isEmpty());

        Student removedStudent = students.remove(2);
        System.out.println("Removed: " + removedStudent);

        System.out.println("Number of students after removal: "
                + students.size());

    } // main ends here

} // class ends here


