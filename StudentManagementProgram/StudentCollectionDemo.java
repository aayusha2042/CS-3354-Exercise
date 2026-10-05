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
 * Demonstrates common Java collection types using Student objects.
 * This program shows how to store, sort, filter, and compare student records.
 *
 * @author Aayusha Adhikari
 * @version 1.0
 */
public class StudentCollectionDemo {

    /**
     * Runs the program and demonstrates Java collection operations.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println(
                "========== STUDENT COLLECTION MANAGEMENT SYSTEM ==========");

        /**
         * Section 1: Create an ArrayList and populate it with sample student records.
         */
        List<Student> students = new ArrayList<>();

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

        /**
         * Section 2: Demonstrate basic ArrayList operations such as add, get, set,
         * contains, size, isEmpty, and remove.
         */
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

        System.out.println("Contains Liam: " + students.contains(newStudent));
        System.out.println("Number of students: " + students.size());
        System.out.println("Is the list empty? " + students.isEmpty());

        Student removedStudent = students.remove(2);
        System.out.println("Removed: " + removedStudent);
        System.out.println("Number of students after removal: " + students.size());

        /**
         * Section 3: Iterate through the list using an enhanced for loop.
         */
        System.out.println("\n3. For-Each Traversal");
        for (Student student : students) {
            System.out.println(student);
        }

        /**
         * Section 4: Traverse the list using an Iterator object.
         */
        System.out.println("\n4. Iterator Traversal");
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /**
         * Section 5: Use the lambda-style forEach method to print each student.
         */
        System.out.println("\n5. Lambda / forEach Traversal");
        students.forEach(s -> System.out.println(s));

        /**
         * Section 6: Sort students by name using the natural ordering defined by
         * the compareTo method in the Student class.
         */
        System.out.println("\n6. Students Sorted by Name");
        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

        /**
         * Section 7: Sort students by GPA using a Comparator.
         */
        System.out.println("\n7. Students Sorted by GPA");
        Comparator<Student> byGPA =
                (s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa());

        Collections.sort(students, byGPA);

        for (Student student : students) {
            System.out.println(student);
        }

        /**
         * Section 8: Sort students by ID using another Comparator.
         */
        System.out.println("\n8. Students Sorted by ID");
        Comparator<Student> byID =
                (s1, s2) -> Integer.compare(s1.getId(), s2.getId());

        Collections.sort(students, byID);

        for (Student student : students) {
            System.out.println(student);
        }

        /**
         * Section 9: Filter the list by removing students whose GPA is below 2.5.
         */
        System.out.println("\n9. Filtering Students Using Iterator");
        System.out.println("Before filtering:");
        for (Student student : students) {
            System.out.println(student);
        }

        Iterator<Student> filterIterator = students.iterator();
        while (filterIterator.hasNext()) {
            Student student = filterIterator.next();

            if (student.getGpa() < 2.5) {
                System.out.println("Removing: " + student);
                filterIterator.remove();
            }
        }

        System.out.println("After filtering:");
        for (Student student : students) {
            System.out.println(student);
        }

        /**
         * Section 10: Compare ArrayList and HashSet behavior with duplicate student IDs.
         */
        System.out.println("\n10. HashSet and Duplicate Student Test");

        Student duplicateStudent =
                new Student(101, "Alex", "History", 3.0);

        List<Student> duplicateList = new ArrayList<>();
        duplicateList.add(students.get(0));
        duplicateList.add(duplicateStudent);

        System.out.println("ArrayList with duplicate ID:");
        for (Student student : duplicateList) {
            System.out.println(student);
        }

        System.out.println("ArrayList size: " + duplicateList.size());

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(students.get(0));

        boolean addedDuplicate = studentSet.add(duplicateStudent);

        System.out.println("\nTrying to add another student with ID 101...");
        System.out.println("Was duplicate added to HashSet? " + addedDuplicate);
        System.out.println("HashSet size: " + studentSet.size());

        for (Student student : studentSet) {
            System.out.println(student);
        }

        /**
         * Section 11: Demonstrate LinkedList and TreeSet behavior.
         */
        System.out.println("\n11. LinkedList and TreeSet");

        LinkedList<Student> linkedStudents = new LinkedList<>(students);

        System.out.println("LinkedList:");
        for (Student student : linkedStudents) {
            System.out.println(student);
        }

        Student firstStudent = new Student(109, "Ava", "Physics", 3.7);
        linkedStudents.addFirst(firstStudent);

        System.out.println("\nAfter adding a student to the beginning:");
        for (Student student : linkedStudents) {
            System.out.println(student);
        }

        linkedStudents.removeFirst();

        System.out.println("\nAfter removing the first student:");
        for (Student student : linkedStudents) {
            System.out.println(student);
        }

        Set<Student> treeSet = new TreeSet<>();
        treeSet.addAll(students);

        System.out.println("\nTreeSet - Students Sorted by Name:");
        for (Student student : treeSet) {
            System.out.println(student);
        }

        System.out.println("\n========== END OF PROGRAM ==========");
    }
}
